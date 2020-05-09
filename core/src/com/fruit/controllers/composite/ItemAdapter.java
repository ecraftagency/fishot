package com.fruit.controllers.composite;

import com.badlogic.gdx.utils.Array;
import com.fruit.controllers.ThrowEngine;

public class ItemAdapter implements ThrowEngine.Item {
  Array<ThrowEngine.ItemResolver> resolvers;
  int itemID;

  public ItemAdapter(int itemID) {
    resolvers = new Array<>();
    this.itemID = itemID;
  }

  @Override
  public int getID() {
    return itemID;
  }

  @Override
  public void cast() {
    for (ThrowEngine.ItemResolver resolver : resolvers)
      resolver.onItemCast(itemID);
  }

  @Override
  public void addResolver(ThrowEngine.ItemResolver resolver) {
    resolvers.add(resolver);
  }
}