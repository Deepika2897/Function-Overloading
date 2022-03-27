package com.FuntionOverload;
/*Design a class to overload a function volume() as follows:

(i)double volume(double r) – with radius ‘r’ as an argument, 
returns the volume of sphere using the formula: v = 4 / 3 × 22 / 7 × r3

(ii)double volume(double h, double r) – with height ‘h’ and radius ‘r’ as the arguments,
returns the volume of a cylinder using the formula: v = 22 / 7 × r2 × h
 
(iii) double volume(double l, double b, double h) –
with length ‘l’, breadth ‘b’ and height ‘h’ as the arguments, 
returns the volume of a cuboid using the formula: v = l × b × h*/

class VolumeOverload
{

     double volume(double r) {
        double vol = 4.0 / 3 * 22 / 7 * Math.pow(r, 3);
        return vol;
    }

    double volume(double h, double r) {
         double vol = 22/ (double)7 * Math.pow(r, 2) * h;
        return vol;
    }
    
    double volume(double l, double b, double h) {
        double vol = l * b * h;
        return vol;
    }
    public static class FunctionOverloading {
  //main function to run this program
    public static void main(String[] args)
  {
    VolumeOverload ob = new VolumeOverload();
    System.out.println(ob.volume(4.0));
    System.out.println(ob.volume(3.0,4.0));
    System.out.println(ob.volume(4.0,4.2,3.0)); 
  }
}


}
