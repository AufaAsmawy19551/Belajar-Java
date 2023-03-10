package test;

import java.util.Formatter;

public class BresenhamLine1 {
    public static void main(String[] args) {
        BresLine(5, 7, 15,10);
    }

    public static void BresLine(int x0, int y0, int xEnd, int yEnd){
        int dx, dy, p, pTemp, twoDy, twoDyMinusDx, x, y, k;
        dx=Math.abs(xEnd-x0);
        dy=Math.abs(yEnd-y0);
        p=2*dy-dx;
        twoDy = 2 * dy;
        twoDyMinusDx = 2 * (dy -dx);

        if (x0 > xEnd){
            x = xEnd;
            y = yEnd;
            xEnd = x0;
        }else {
            x=x0;
            y=y0;
        }

        k = 0;

        Formatter fmt = new Formatter();
        fmt.format("%5s %5s %15s\n", "K", "Px", "(X k+1, Y k+1)");

        while(x < xEnd) {
            pTemp = p;
            x++;

            if(p < 0) {
                fmt.format("%5s %5s %10s\n", k, pTemp, (x + ", " + y));
                p += twoDy;

                if (k == 0){
                    System.out.println("Untuk k = " + k);
                    System.out.println("p" + k + " = " + 2 * dy + " - " + dx + " = " + pTemp + "\n");

                }else{
                    System.out.println("Untuk k = " + k);
                    System.out.println("p" + k + " = " + "p" + (k - 1) + " + 2*dy" + " = " + pTemp + " + " + 2 * dy + " = " + p + "\n");
                }
            } else {
                y++;
                fmt.format("%5s %5s %10s\n", k, pTemp, (x + ", " + y));
                p += twoDyMinusDx;

                if (k == 0){
                    System.out.println("Untuk k = " + k);
                    System.out.println("p" + k + " = " + 2 * dy + " - " + dx + " = " + pTemp + "\n");
                }else{
                    System.out.println("Untuk k = " + k);
                    System.out.println("p" + k + " = " + "p" + (k - 1) + " + 2*dy - 2*dx" + " = " + pTemp + " + " + 2*dy + " - " + 2*dx + " = " + p + "\n");
                }
            }


            k++;
        }

        System.out.println(fmt);
    }
}
