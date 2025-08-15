package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: x9b  reason: default package */
public final class x9b {
    public final int a;
    public final Rect b;
    public final int c;
    public final int d;
    public final Matrix e;
    public final yhc f;
    public final String g;
    public final ArrayList h;
    public final bm7 i;
    public int j = -1;

    public x9b(iz1 iz1, Rect rect, int i2, int i3, Matrix matrix, yhc yhc, oq1 oq1, int i4) {
        this.a = i4;
        this.d = i3;
        this.c = i2;
        this.b = rect;
        this.e = matrix;
        this.f = yhc;
        this.g = String.valueOf(iz1.hashCode());
        this.h = new ArrayList();
        List<tz1> list = iz1.a;
        Objects.requireNonNull(list);
        for (tz1 tz1 : list) {
            ArrayList arrayList = this.h;
            tz1.getClass();
            arrayList.add(0);
        }
        this.i = oq1;
    }
}
