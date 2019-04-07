package com.epam.gitdemo;

import java.util.*;

public class fourth {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        int i,j,q=s.nextInt();
        int[] a=new int[100010];
        int front=-1,rear=-1;
        for(i=0;i<q;i++)
        {
            int x=s.nextInt();
            if(x==1)
            {
                int y=s.nextInt();
                a[++rear]=y;
                if(front==-1)
                    front=0;
            }
            else if(x==2)
            {
                for(j=0;j<rear;j++)
                    a[j]=a[j+1];
                rear--;
                if(rear==-1)
                front=-1;
            }
            else{
                System.out.println(a[front]);
            }
        }
    }
}

