package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ijd  reason: default package */
public final class ijd extends ojd {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public ijd(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    public final void a(Matrix matrix, ejd ejd, int i, Canvas canvas) {
        for (ojd a : this.c) {
            a.a(this.d, ejd, i, canvas);
        }
    }
}
