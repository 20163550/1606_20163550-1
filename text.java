//20163584 信1603 许金艳
package 临时的;
class Trangle//三角形类
{
	double sideA,sideB,sideC,area,length;//定义变量
	boolean boo;//布尔型变量
	public Trangle(double a,double b,double c)//定义三角形函数
	{
		sideA=a;
		sideB=b;
		sideC=c;
		if((a+b>c)&&(b+c>a)&&(c+a>b))//判断是否构成三角形
		{
			boo=true;//返回布尔类型的值
		}
		else 
		{
			boo=false;
		}
	}
	double getLength()//计算三角形面积的函数
	{
		if(boo)//判断能否形成三角形
		{
		double length=sideA+sideB+sideC;//计算三角形周长
		return length;
		}
		else 
		{
			System.out.println("不是一个三角形，不能计算周长");
			return 0;
		}
	}
	public double getArea() //计算三角形面积函数
	{
		if(boo)
		{
			double p=(sideA+sideB+sideC)/2.0;
			area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));//计算公式
			return area;
		}
		else 
		{
			System.out.println("不是一个三角形，不能计算面积");
			return 0;
		}
	}
	public void setABC(double a,double b,double c)//得到三角形三边长函数
	{
		sideA=a;
		sideB=b;
		sideC=c;
		if((a+b>c)&&(b+c>a)&&(c+a>b))
		{
			boo=true;
		}
		else 
		{
			boo=false;
		}
	}
}
class Lader//编写梯形类
{
	double above,bottom,height,area;//定义各个变量
	Lader(double a,double b,double h)
	{
		above=a;
		bottom=b;
		height=h;
	}
	double getArea()//计算面基函数
	{
		double area=(above+bottom)*height/2.0;
		return area;
	}
}
class Circle//编写圆类
{
	double radius;//定义变量
	double area;
	Circle(double r)
	{
		radius=r;
	}
	double getArea()//求圆的面积函数
	{
		double area=3.14*radius*radius;
		return area;
	}
	double getLength()//求圆的周长函数
	{
		double length=2*3.14*radius;
		return length;
	}
	void setRadius(double newRadius)
	{
		radius=newRadius;
	}
	double getRadius()
	{
		return radius;
	}
}
public class text//主函数
{

	public static void main(String[] args)//主函数
	{
		// TODO Auto-generated method stub
     double length,area;
     Circle ciecle=null;
     Trangle trangle;//定义类型变量
     Lader lader;
     Circle c=new  Circle(3);//定义输入
     Trangle t=new Trangle(6,8,10);
     Lader l=new  Lader(1,3,5);
    length= c.getLength();//
    System.out.println("圆的周长："+length);//输出
    area=c.getArea();
    System.out.println("圆的面积："+area);
    length=t.getLength();
    System.out.println("三角形的周长："+length);
    area=t.getArea();
    System.out.println("三角形的面积：："+area);
    area =l.getArea();
    System.out.println("梯形的面积：："+area);
    t.setABC(12, 34, 1);
    area=t.getArea();
    System.out.println("三角形的面积：："+area);
    length=t.getLength();
    System.out.println("三角形的周长："+length); 
	}

}
