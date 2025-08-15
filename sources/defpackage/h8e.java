package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: h8e  reason: default package */
public final class h8e extends ndc {
    public final RecyclerView X;
    public final boolean Y = true;
    public final Rect Z = new Rect();
    public final SparseBooleanArray a = new SparseBooleanArray();
    public final hdc b;
    public final i8e c;
    public final ty2 o;
    public final Rect s0 = new Rect();
    public final gaa t0 = new gaa(17);
    public f8e u0;
    public final AtomicBoolean v0 = new AtomicBoolean(true);
    public final e8e w0 = new e8e(this, 0);

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, ty2] */
    public h8e(RecyclerView recyclerView, hdc hdc, i8e i8e) {
        this.b = hdc;
        boolean z = hdc instanceof i8e;
        this.c = i8e;
        ? obj = new Object();
        obj.o = new SparseArray();
        obj.X = new SparseArray();
        obj.Y = new SparseArray();
        obj.a = recyclerView;
        obj.b = hdc;
        obj.c = i8e;
        d8e d8e = new d8e(obj, 0, recyclerView);
        hdc.z(d8e);
        obj.Z = d8e;
        this.o = obj;
        this.X = recyclerView;
        f8e f8e = new f8e(this, recyclerView, 0);
        hdc.z(f8e);
        this.u0 = f8e;
    }

    public static final void i(h8e h8e) {
        h8e.a.clear();
        if (h8e.v0.compareAndSet(true, false)) {
            e8e e8e = h8e.w0;
            RecyclerView recyclerView = h8e.X;
            kp.x(recyclerView, e8e);
            recyclerView.post(new e8e(h8e, 1));
        }
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        boolean k = k(R);
        gaa gaa = this.t0;
        if (k) {
            ty2 ty2 = this.o;
            if (ty2.j(R) != null) {
                c8e k2 = ty2.k(R);
                int i = k2.c;
                if (i < 0) {
                    rect.top -= i;
                }
                rect.top = k2.a.getMeasuredHeight() + rect.top;
                gaa.E(rect, view, recyclerView);
                return;
            }
        }
        gaa.E(rect, view, recyclerView);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        hdc hdc = this.b;
        int j = hdc.j();
        if (childCount > 0 && j > 0) {
            int i = 0;
            while (true) {
                if (i < recyclerView.getChildCount()) {
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt != null) {
                        int R = RecyclerView.R(childAt);
                        if (R != -1) {
                            ty2 ty2 = this.o;
                            if (ty2.j(R) != null) {
                                boolean k = k(R);
                                gaa gaa = this.t0;
                                Rect rect = this.Z;
                                gaa.v(rect, childAt, R);
                                boolean z = rect.top <= 0 && rect.bottom > 0;
                                if (k || z) {
                                    c8e k2 = ty2.k(R);
                                    boolean z2 = z && this.Y;
                                    int measuredHeight = ty2.k(R).a.getMeasuredHeight();
                                    gaa.v(rect, childAt, R);
                                    Rect rect2 = this.s0;
                                    gaa.x(rect2, childAt, R);
                                    if (z2) {
                                        if (R >= hdc.j() - 1 || !k(R + 1)) {
                                            this.c.getClass();
                                            if (!k || rect2.top < 0) {
                                                rect2.offsetTo(rect2.left, 0);
                                            }
                                        } else {
                                            int i3 = rect.bottom;
                                            if (measuredHeight > i3) {
                                                rect2.offsetTo(rect2.left, i3 - measuredHeight);
                                            } else {
                                                rect2.offsetTo(rect2.left, 0);
                                            }
                                        }
                                    }
                                    int save = canvas.save();
                                    canvas.translate(0.0f, (float) rect2.top);
                                    try {
                                        View view = k2.a;
                                        if (c54.K(view)) {
                                            canvas.translate((float) ((canvas.getWidth() - view.getMeasuredWidth()) - k2.b), 0.0f);
                                        } else {
                                            canvas.translate((float) k2.b, 0.0f);
                                        }
                                        view.draw(canvas);
                                    } finally {
                                        canvas.restoreToCount(save);
                                    }
                                }
                            }
                        }
                        i = i2;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void j() {
        ty2 ty2 = this.o;
        ((SparseArray) ty2.X).clear();
        ((SparseArray) ty2.o).clear();
        ((SparseArray) ty2.Y).clear();
    }

    public final boolean k(int i) {
        Object j;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return sparseBooleanArray.get(i);
        }
        ty2 ty2 = this.o;
        Object j2 = ty2.j(i);
        boolean z = false;
        if (j2 != null && (i <= 0 || (j = ty2.j(i - 1)) == null || !j2.equals(j))) {
            z = true;
        }
        sparseBooleanArray.put(i, z);
        return z;
    }
}
