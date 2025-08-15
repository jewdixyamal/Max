package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Map;

/* renamed from: ry7  reason: default package */
public final /* synthetic */ class ry7 implements s0a {
    public final /* synthetic */ Context X;
    public final /* synthetic */ vy7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ i08 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ ry7(vy7 vy7, long j, i08 i08, boolean z, Context context) {
        this.a = vy7;
        this.b = j;
        this.c = i08;
        this.o = z;
        this.X = context;
    }

    public final void e(ez9 ez9) {
        float f;
        float f2;
        ez9 ez92 = ez9;
        vy7 vy7 = this.a;
        vy7.getClass();
        vy7.a();
        long j = this.b;
        i08 i08 = this.c;
        boolean z = this.o;
        ty7 ty7 = new ty7(j, i08, z);
        Map map = vy7.d;
        sy7 sy7 = (sy7) map.get(ty7);
        if (!ez9.h()) {
            if (sy7 == null) {
                Context context = this.X;
                ez92.d(vy7.b(context, i08, true, z).b);
                vy7.a();
                ty7 ty72 = new ty7(j, i08, z);
                sy7 sy72 = (sy7) map.get(ty72);
                if (sy72 == null) {
                    Bitmap bitmap = vy7.b(context, i08, true, z).a;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    xke xke = vy7.f;
                    uj3 i = ((el3) xke.e.getValue()).i(j, false);
                    Bitmap a2 = ld0.a(xke.a, (ida) xke.c.getValue(), (p82) xke.d.getValue(), (pd0) xke.b.getValue(), i, (String) null, ((hyc) ((q33) xke.f.getValue())).q(), (ztc) xke.g.getValue());
                    int ordinal = i08.ordinal();
                    if (ordinal == 0) {
                        f2 = 0.65f;
                        f = 2.63f;
                    } else if (ordinal == 1) {
                        f2 = 0.72f;
                        f = 2.59f;
                    } else {
                        throw new IllegalStateException("Wrong marker weight");
                    }
                    float f3 = (float) width;
                    float f4 = f2 * f3;
                    int width2 = (int) ((f4 / ((float) a2.getWidth())) * ((float) a2.getHeight()));
                    Bitmap j0 = j47.j0((int) f4, width2, a2);
                    a2.recycle();
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.drawBitmap(j0, (f3 / 2.0f) - (f4 / 2.0f), (((float) height) / f) - (((float) width2) / 2.0f), (Paint) null);
                    j0.recycle();
                    a2.recycle();
                    vy7.g.getClass();
                    sy72 = new sy7(createBitmap, qx7.i(createBitmap));
                    map.put(ty72, sy72);
                }
                ez92.d(sy72.b);
            } else {
                ez92.d(sy7.b);
            }
        }
        ez9.b();
    }
}
