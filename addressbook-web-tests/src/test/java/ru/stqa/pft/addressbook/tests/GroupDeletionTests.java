package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void test() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().gotoGroupPage();
  }
}
