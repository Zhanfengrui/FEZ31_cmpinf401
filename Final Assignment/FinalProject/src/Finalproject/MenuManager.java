package Finalproject;

import java.util.ArrayList;

public class MenuManager {

private ArrayList<Entree> entrees=new ArrayList<Entree>();

private ArrayList<Side> sides=new ArrayList<Side>();

private ArrayList<Salad> salads=new ArrayList<Salad>();
private ArrayList<Dessert> desserts=new ArrayList<Dessert>();

public MenuManager(String dishesFile) {

ArrayList<MenuItem> menuItems=FileManager.readItems(dishesFile);
for(int i=0;i<menuItems.size();i++) {
if(menuItems.get(i) instanceof Entree) {
entrees.add((Entree) menuItems.get(i));
}
if(menuItems.get(i) instanceof Side) {
sides.add((Side) menuItems.get(i));
}
if(menuItems.get(i) instanceof Salad) {
salads.add((Salad) menuItems.get(i));
}
if(menuItems.get(i) instanceof Dessert) {
desserts.add((Dessert) menuItems.get(i));
}
}
}

public ArrayList<Entree> getEntrees() {
return entrees;
}

public void setEntrees(ArrayList<Entree> entrees) {
this.entrees = entrees;
}

public ArrayList<Side> getSides() {
return sides;
}

public void setSides(ArrayList<Side> sides) {
this.sides = sides;
}

public ArrayList<Salad> getSalads() {
return salads;
}


public void setSalads(ArrayList<Salad> salads) {
this.salads = salads;
}

public ArrayList<Dessert> getDesserts() {
return desserts;
}

public void setDesserts(ArrayList<Dessert> desserts) {
this.desserts = desserts;
}


public Menu randomMenu(String name) {

Entree entree=entrees.get((int)(Math.random()*entrees.size()));
Side side=sides.get((int)(Math.random()*sides.size()));
Salad salad=salads.get((int)(Math.random()*salads.size()));
Dessert dessert=desserts.get((int)(Math.random()*desserts.size()));

return new Menu(name,entree,side,salad,dessert);
}

public Menu minCaloriesMenu(String name) {
int min=Integer.MAX_VALUE;
int[] index=new int[4];
for(int i=0;i<entrees.size();i++) {
if(min>entrees.get(i).getCalories()) {
min=entrees.get(i).getCalories();
index[0]=i;
}
}
min=Integer.MAX_VALUE;
for(int i=0;i<sides.size();i++) {
if(min>sides.get(i).getCalories()) {
min=sides.get(i).getCalories();
index[1]=i;
}
}
min=Integer.MAX_VALUE;
for(int i=0;i<salads.size();i++) {
if(min>salads.get(i).getCalories()) {
min=salads.get(i).getCalories();
index[2]=i;
}
}
min=Integer.MAX_VALUE;
for(int i=0;i<desserts.size();i++) {
if(min>desserts.get(i).getCalories()) {
min=desserts.get(i).getCalories();
index[3]=i;
}
}

return new Menu(name,entrees.get(index[0]),
sides.get(index[1]),
salads.get(index[2]),
desserts.get(index[3]));
}

public Menu maxCaloriesMenu(String name) {
int max=Integer.MIN_VALUE;
int[] index=new int[4];
for(int i=0;i<entrees.size();i++) {
if(max<entrees.get(i).getCalories()) {
max=entrees.get(i).getCalories();
index[0]=i;
}
}
max=Integer.MIN_VALUE;
for(int i=0;i<sides.size();i++) {
if(max<sides.get(i).getCalories()) {
max=sides.get(i).getCalories();
index[1]=i;
}
}
max=Integer.MIN_VALUE;
for(int i=0;i<salads.size();i++) {
if(max<salads.get(i).getCalories()) {
max=salads.get(i).getCalories();
index[2]=i;
}
}
max=Integer.MIN_VALUE;
for(int i=0;i<desserts.size();i++) {
if(max<desserts.get(i).getCalories()) {
max=desserts.get(i).getCalories();
index[3]=i;
}
}

return new Menu(name,entrees.get(index[0]),
sides.get(index[1]),
salads.get(index[2]),
desserts.get(index[3]));
}


}

