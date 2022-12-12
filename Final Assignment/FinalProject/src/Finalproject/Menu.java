package Finalproject;

import java.util.ArrayList;

public class Menu {

private String name;
private Entree entree;
private Salad salad;
private Side side;
private Dessert dessert;


public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Entree getEntree() {
return entree;
}

public void setEntree(Entree entree) {
this.entree = entree;
}

public Salad getSalad() {
return salad;
}

public void setSalad(Salad salad) {
this.salad = salad;
}

public Side getSide() {
return side;
}

public void setSide(Side side) {
this.side = side;
}

public Dessert getDessert() {
return dessert;
}

public void setDessert(Dessert dessert) {
this.dessert = dessert;
}


public Menu(String name) {
this.name=name;
this.entree=null;
this.side=null;
this.dessert=null;
}

public Menu(String name, Entree entree, Side side) {
this.name=name;
this.entree=entree;
this.side=side;
this.dessert=null;
}

public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
this.name=name;
this.entree=entree;
this.side=side;
this.salad=salad;
this.dessert=dessert;
}

public int totalCalories() {
int sum=0;
if(!(entree==null)){
sum+=entree.getCalories();
}
if(!(side==null)) {
sum+=side.getCalories();
}
if(!(salad==null)) {
sum+=salad.getCalories();
}
if(!(dessert==null)) {
sum+=dessert.getCalories();
}
return sum;
}


public int totalPrice() {
int sum=0;
if(!(entree==null)){
sum+=entree.getPrice();
}
if(!(side==null)) {
sum+=side.getPrice();
}
if(!(salad==null)) {
sum+=salad.getPrice();
}
if(!(dessert==null)) {
sum+=dessert.getPrice();
}
return sum;
}

public String description() {

return name+"\n"+"Entree:"+entree.getName()+"\n"+entree.getDescription()+"\n"+"Calories:"+entree.getCalories()+"\n"+"Price:"+entree.getPrice()+"\n"+
"Side:"+side.getName()+"\n"+side.getDescription()+"\n"+"Calories:"+side.getCalories()+"\n"+"Price:"+side.getPrice()+"\n"+
"Side:"+salad.getName()+"\n"+salad.getDescription()+"\n"+"Calories:"+salad.getCalories()+"\n"+"Price:"+salad.getPrice()+"\n"+
"Dessert:"+dessert.getName()+"\n"+dessert.getDescription()+"\n"+"Calories:"+dessert.getCalories()+"\n"+"Price:"+dessert.getPrice()+"\n";
}

@Override
public String toString() {
return name;
}

}
