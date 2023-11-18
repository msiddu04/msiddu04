class student{
	int mca=2;
	int btech=4;
	public void course(){
   	  System.out.println("duriation of course:"+ mca);
	  System.out.println("duriation of course:"+ btech);	
	}
	public void semister(){
	  System.out.println("no of semister for mca:"+ 2*mca);
	  System.out.println("no of semister for btech:"+ 2*btech);
	}
}

class square{
	int length=75;
	int breath=34;

	public void area(){
	int a=length*breath;
		System.out.println("area of square:"+ a);
	}

	public void perimeter(){
	int p=2*(length+breath);
		System.out.println("area of square:"+ p);
	}

}

class university{
	int it=2;
	int mech=8;
	public void department(){
		System.out.println("no of departments of it:"+ it);
		System.out.println("no of departments of mech:"+ mech);
	}
	public void library(){
		System.out.println("no of library of it:"+ it*2);
		System.out.println("no of library of mech:"+ mech*2);
	}
}

class main{
public static void main(String[] args){
student s = new student();
square sq = new square();
university u = new university();
s.course();
s.semister();
sq.area();
sq.perimeter();
u.department();
u.library();
}
}