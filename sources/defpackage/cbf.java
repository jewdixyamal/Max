package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: cbf  reason: default package */
public final class cbf {
    public final qre a;
    public final je7 b = tu0.r(3, new bse(5));
    public final je7 c = tu0.r(3, new bse(6));
    public final je7 d = tu0.r(3, new bse(7));
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public cbf(qre qre) {
        this.a = qre;
    }

    public static void a(Canvas canvas, ArrayList arrayList, ArrayList arrayList2, Paint paint) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                bbf bbf = (bbf) next;
                Shader shader = (Shader) x53.j0(i, arrayList2);
                if (shader != null) {
                    paint.setShader(shader);
                    float f2 = bbf.c;
                    float f3 = bbf.b;
                    float f4 = bbf.a;
                    float f5 = bbf.d;
                    float max = f2 / Math.max(f2, f5);
                    float f6 = bbf.c;
                    float max2 = f5 / Math.max(f6, f5);
                    int save = canvas.save();
                    try {
                        canvas.rotate(bbf.e, f4, f3);
                        canvas.scale(max, max2, f4, f3);
                        canvas.drawCircle(f4, f3, Math.max(f6, f5), paint);
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
                i = i2;
            } else {
                y53.R();
                throw null;
            }
        }
    }

    public static void b(List list, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        arrayList.clear();
        arrayList2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ore ore = (ore) it.next();
            float f2 = (float) i;
            float f3 = (ore.a * f2) / 100.0f;
            float f4 = (float) i2;
            float f5 = (ore.b * f4) / 100.0f;
            float f6 = (f2 * ore.e) / 100.0f;
            float f7 = (f4 * ore.f) / 100.0f;
            float f8 = f3;
            float f9 = f5;
            arrayList2.add(new RadialGradient(f8, f9, Math.max(f6, f7), ore.c, ore.d, Shader.TileMode.CLAMP));
            ArrayList arrayList3 = arrayList;
            arrayList3.add(new bbf(f3, f5, f6, f7, ore.g, ore.d));
        }
    }

    public static final void c(int i, int i2, float f2, float[] fArr) {
        float f3 = ((float) i) / 2.0f;
        float f4 = ((float) i2) / 2.0f;
        double d2 = (double) f2;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float abs = Math.abs(f3 / cos);
        float abs2 = Math.abs(f4 / sin);
        kpa kpa = abs >= abs2 ? new kpa(Float.valueOf(Math.abs(abs2 * cos)), Float.valueOf(f4)) : new kpa(Float.valueOf(f3), Float.valueOf(Math.abs(abs * sin)));
        float floatValue = ((Number) kpa.a).floatValue();
        float floatValue2 = ((Number) kpa.b).floatValue();
        int i3 = (cos > 0.0f ? 1 : (cos == 0.0f ? 0 : -1));
        if (i3 < 0 || sin < 0.0f) {
            int i4 = (cos > 0.0f ? 1 : (cos == 0.0f ? 0 : -1));
            if (i4 < 0 && sin >= 0.0f) {
                fArr[0] = f3 - floatValue;
                fArr[1] = f4 - floatValue2;
            } else if (i4 < 0 && sin < 0.0f) {
                fArr[0] = f3 - floatValue;
                fArr[1] = f4 + floatValue2;
            } else if (i3 >= 0 && sin < 0.0f) {
                fArr[0] = f3 + floatValue;
                fArr[1] = f4 + floatValue2;
            }
        } else {
            fArr[0] = f3 + floatValue;
            fArr[1] = f4 - floatValue2;
        }
    }
}
