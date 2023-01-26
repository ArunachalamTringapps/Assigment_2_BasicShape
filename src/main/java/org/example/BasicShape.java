package org.example;

import java.util.Scanner;
class BasicShape{
    public double triangle,rectangle,circle;
    public double lengthtri1,lengthtri2,lengthtri3;
    public double lengthrect,widthrect;
    public double radiuscircle;
    public double breadthtri,heighttri;
    Scanner sc=new Scanner(System.in);
    BasicShape(int ch)
    {
        if(ch==1)
        {
            System.out.println("Enter your choice to perform area operation for the shapes?\n1.Area for Rectangle\n2.Area for Triangle\n3.Area for Circle\n");
            int a=sc.nextInt();
            this.areashapes(a);
        }
        else if(ch==2){
            System.out.println("Enter your choice to perform Perimeter operation for the shapes?\n1.Perimeter for Rectangle\n2.Perimeter for Triangle\n3.Perimeter for Circle\n");
            int b=sc.nextInt();
            this.perimetershapes(b);
        }
        else{
            System.out.println("Please Enter correct choice");
        }
    }
    void areashapes(int shape)
    {
        if(shape==1)
        {
            System.out.println("Enter the length and width of a Rectangle");
            lengthrect=sc.nextDouble();
            widthrect=sc.nextDouble();
            rectangle=lengthrect*widthrect;
            System.out.println("The Area of Rectangle is:"+rectangle);
        }
        if(shape==2){
            System.out.println("Enter the breadth and height of a Triangle");
            breadthtri=sc.nextDouble();
            heighttri=sc.nextDouble();
            triangle=(breadthtri*heighttri)/2;
            System.out.println("The Area of Triangle is:"+triangle);
        }
        if(shape==3){
            System.out.println("Enter the radius for a circle");
            radiuscircle=sc.nextDouble();
            circle=Math.PI*radiuscircle*radiuscircle;
            System.out.println("The Area of Circle is:"+circle);
        }
    }
    void perimetershapes(int shape){
        if(shape==1){
            System.out.println("Enter the length and width of a Rectangle");
            lengthrect=sc.nextDouble();
            double breadthrect=sc.nextDouble();
            rectangle=2*(lengthrect+breadthrect);
            System.out.println("The Perimeter of Rectangle is:"+rectangle);
        }
        if(shape==2){
            System.out.println("Enter the breadth and height of a Triangle");
            lengthtri1=sc.nextDouble();
            lengthtri2=sc.nextDouble();
            lengthtri3=sc.nextDouble();
            triangle=lengthtri1*lengthtri2*lengthtri3;
            System.out.println("The Perimeter of Triangle is:"+triangle);
        }
        if(shape==3){
            System.out.println("Enter the radius for a circle");
            radiuscircle=sc.nextDouble();
            circle=2*Math.PI*radiuscircle;
            System.out.println("The Perimeter of Circle is:"+circle);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which choice you want to choose? \n1.Area for shapes\n2.Perimeter for shapes\n");
        int ch=sc.nextInt();
        BasicShape s=new BasicShape(ch);
    }
}