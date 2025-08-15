package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ro0  reason: default package */
public final /* synthetic */ class ro0 implements Runnable {
    public final /* synthetic */ ow6[] X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ RandomAccessFile Z;
    public final /* synthetic */ vo0 a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ Bitmap[] c;
    public final /* synthetic */ int o;
    public final /* synthetic */ ArrayList s0;
    public final /* synthetic */ CountDownLatch[] t0;

    public /* synthetic */ ro0(vo0 vo0, AtomicBoolean atomicBoolean, Bitmap[] bitmapArr, int i, ow6[] ow6Arr, int i2, RandomAccessFile randomAccessFile, ArrayList arrayList, CountDownLatch[] countDownLatchArr) {
        this.a = vo0;
        this.b = atomicBoolean;
        this.c = bitmapArr;
        this.o = i;
        this.X = ow6Arr;
        this.Y = i2;
        this.Z = randomAccessFile;
        this.s0 = arrayList;
        this.t0 = countDownLatchArr;
    }

    public final void run() {
        vo0 vo0 = this.a;
        AtomicBoolean atomicBoolean = this.b;
        Bitmap[] bitmapArr = this.c;
        int i = this.o;
        ow6[] ow6Arr = this.X;
        int i2 = this.Y;
        RandomAccessFile randomAccessFile = this.Z;
        ArrayList arrayList = this.s0;
        CountDownLatch[] countDownLatchArr = this.t0;
        if (!vo0.o.get() && !atomicBoolean.get()) {
            bitmapArr[i].compress(Bitmap.CompressFormat.WEBP, vo0.l, ow6Arr[i]);
            int i3 = ow6Arr[i].b;
            try {
                synchronized (vo0.h) {
                    uo0 uo0 = new uo0(i2);
                    uo0.c = (int) randomAccessFile.length();
                    arrayList.add(uo0);
                    randomAccessFile.write(ow6Arr[i].a, 0, i3);
                    uo0.b = i3;
                    ow6 ow6 = ow6Arr[i];
                    synchronized (ow6) {
                        ow6.b = 0;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    atomicBoolean.set(true);
                    throw th;
                }
                atomicBoolean.set(true);
            }
            countDownLatchArr[i].countDown();
        }
    }
}
