//20163584 ��1603 �����
package ��ʱ��;
class Trangle//��������
{
	double sideA,sideB,sideC,area,length;//�������
	boolean boo;//�����ͱ���
	public Trangle(double a,double b,double c)//���������κ���
	{
		sideA=a;
		sideB=b;
		sideC=c;
		if((a+b>c)&&(b+c>a)&&(c+a>b))//�ж��Ƿ񹹳�������
		{
			boo=true;//���ز������͵�ֵ
		}
		else 
		{
			boo=false;
		}
	}
	double getLength()//��������������ĺ���
	{
		if(boo)//�ж��ܷ��γ�������
		{
		double length=sideA+sideB+sideC;//�����������ܳ�
		return length;
		}
		else 
		{
			System.out.println("����һ�������Σ����ܼ����ܳ�");
			return 0;
		}
	}
	public double getArea() //�����������������
	{
		if(boo)
		{
			double p=(sideA+sideB+sideC)/2.0;
			area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));//���㹫ʽ
			return area;
		}
		else 
		{
			System.out.println("����һ�������Σ����ܼ������");
			return 0;
		}
	}
	public void setABC(double a,double b,double c)//�õ����������߳�����
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
class Lader//��д������
{
	double above,bottom,height,area;//�����������
	Lader(double a,double b,double h)
	{
		above=a;
		bottom=b;
		height=h;
	}
	double getArea()//�����������
	{
		double area=(above+bottom)*height/2.0;
		return area;
	}
}
class Circle//��дԲ��
{
	double radius;//�������
	double area;
	Circle(double r)
	{
		radius=r;
	}
	double getArea()//��Բ���������
	{
		double area=3.14*radius*radius;
		return area;
	}
	double getLength()//��Բ���ܳ�����
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
public class text//������
{

	public static void main(String[] args)//������
	{
		// TODO Auto-generated method stub
     double length,area;
     Circle ciecle=null;
     Trangle trangle;//�������ͱ���
     Lader lader;
     Circle c=new  Circle(3);//��������
     Trangle t=new Trangle(6,8,10);
     Lader l=new  Lader(1,3,5);
    length= c.getLength();//
    System.out.println("Բ���ܳ���"+length);//���
    area=c.getArea();
    System.out.println("Բ�������"+area);
    length=t.getLength();
    System.out.println("�����ε��ܳ���"+length);
    area=t.getArea();
    System.out.println("�����ε��������"+area);
    area =l.getArea();
    System.out.println("���ε��������"+area);
    t.setABC(12, 34, 1);
    area=t.getArea();
    System.out.println("�����ε��������"+area);
    length=t.getLength();
    System.out.println("�����ε��ܳ���"+length); 
	}

}
