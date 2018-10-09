package _10.override;

 class Box {
    double width;
    double height;
    double depth;

    public Box(Box ob) {
         width=ob.width;
         height=ob.height;
         depth=ob.depth;
     }

     public Box(double width, double height, double depth) {
         this.width = width;
         this.height = height;
         this.depth = depth;
     }

     public Box() {
          width=-1;
          height=-1;
          depth=-1;
     }
     public Box(double len){
           width=height=depth=len;
     }
     double volume(){
          return  width*height*depth;
     }

 }



