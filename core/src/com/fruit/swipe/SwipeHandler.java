package com.fruit.swipe;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.DragListener;
import com.fruit.swipe.simplify.ResolverRadialChaikin;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.fruit.AssetLoader;

@SuppressWarnings("unused")
public class SwipeHandler extends DragListener {
	private 					FixedList<Vector2> 			inputPoints;
	private 					int 										inputPointer 				= 0;
	public 						int 										initialDistance 		= 10;
	public 						int 										minDistance 				= 20;
	private 					Vector2 								lastPoint 					= new Vector2();
	private 			 		boolean 								isDrawing 					= false;
	private 					SwipeResolver 					simplifier 					= new ResolverRadialChaikin();
	private 					Array<Vector2> 					simplified;
	private 					Sound[]									swipe;
	private 					Vector2									swipeDirection			= new Vector2();

	private static final	int	minNSound = 0;
	private static final	int	maxNSound = 5;
	private static final 	int magicNumber = 20;

	public SwipeHandler(int maxInputPoints) {
		this.inputPoints = new FixedList<>(maxInputPoints, Vector2.class);
		simplified = new Array<>(true, maxInputPoints, Vector2.class);
		resolve(); //copy initial empty list
		swipe = new Sound[] {
						AssetLoader.getSound("slash1"),
						AssetLoader.getSound("slash2"),
						AssetLoader.getSound("slash3"),
						AssetLoader.getSound("slash4"),
						AssetLoader.getSound("slash5"),
						AssetLoader.getSound("slash6")

		};
	}

	public Array<Vector2> input() {
		return this.inputPoints;
	}
	public Array<Vector2> path() {
		return simplified;
	}
	private void resolve() {
		simplifier.resolve(inputPoints, simplified);
	}


	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
		if (pointer!=inputPointer)
			return false;
		isDrawing = true;
		inputPoints.clear();
		lastPoint = new Vector2(x, y);
		inputPoints.insert(lastPoint);
		resolve();
		return super.touchDown(event, x, y, pointer, button);
	}

	@Override
	public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
		resolve();
		isDrawing = false;
		simplified.clear();
		super.touchUp(event, x, y, pointer, button);
		pointCount = 0;
		acc = 0;
	}

	private int pointCount = 0;

	private float acc = 0;
	@Override
	public void touchDragged(InputEvent event, float x, float y, int pointer) {
		if (pointer!=inputPointer)
			return;
		isDrawing = true;
		Vector2 v = new Vector2(x, y);
		float dx = v.x - lastPoint.x;
		float dy = v.y - lastPoint.y;

		if (pointCount >= magicNumber) {
			if (acc >= 300) {
				pointCount = 0;
				int i = MathUtils.random(minNSound, maxNSound);
				swipe[i].play();
				acc = 0;
			}
			else {
				acc = 0;
				pointCount = 0;
			}
		}

		float len = (float)Math.sqrt(dx*dx + dy*dy);
		if (len < minDistance && (inputPoints.size>1 || len<initialDistance))
			return;

		acc+= len;
		pointCount++;
		inputPoints.insert(v);
		swipeDirection.set(v.cpy().sub(lastPoint));
		lastPoint = v;
		resolve();
		super.touchDragged(event, x, y, pointer);
	}

	public Vector2 getSwipeDirection() {
		return swipeDirection;
	}
}
