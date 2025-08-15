package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: aw5  reason: default package */
public final class aw5 extends ppd implements y67 {
    public final m56 X;
    public final c66 Y;
    public final re6 Z;

    public aw5(ExecutorService executorService, f fVar, ut0 ut0, re6 re6) {
        super(executorService);
        this.X = fVar;
        this.Y = ut0;
        this.Z = re6;
    }

    /* renamed from: J */
    public final void r(y9f y9f, int i) {
        w9f w9f = (w9f) ((ol7) C(i));
        View view = y9f.a;
        x9f x9f = (x9f) view;
        x9f.setType(w9f.b);
        CharSequence a = w9f.c.a(y9f);
        if (a == null) {
            a = "";
        }
        x9f.setTitle(a);
        y9f.F0 = this.Z;
        v9f v9f = v9f.a;
        v9f v9f2 = w9f.b;
        if (v9f2 == v9f) {
            ((x9f) view).setOnClickListener((View.OnClickListener) null);
        } else {
            tu0.K(view, 300, new ev5(this.X, w9f, 1));
        }
        if (v9f2 == v9f.b) {
            x9f x9f2 = (x9f) view;
            x9f2.setOnDragIconTouchListener(new bk(21, y9f));
            x9f2.setActionMenuIconClickListener(new lr1(this.Y, w9f, y9f, 13));
        }
    }

    public final void W(int i, int i2) {
        boolean z = false;
        boolean z2 = ((w9f) ((ol7) C(i2))).b == v9f.b;
        if (i2 <= 0 || i2 >= j()) {
            z = true;
        }
        if (z2 && !z) {
            ArrayList arrayList = new ArrayList(this.o.f);
            Object obj = arrayList.get(i);
            arrayList.remove(i);
            arrayList.add(i2, obj);
            F(arrayList, new si1(this, i, i2, arrayList));
        }
    }

    public final int l(int i) {
        int ordinal = ((w9f) ((ol7) C(i))).b.ordinal();
        if (ordinal == 0) {
            return oba.h;
        }
        if (ordinal == 1) {
            return oba.p;
        }
        if (ordinal == 2) {
            return oba.i;
        }
        if (ordinal == 3) {
            return oba.l;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final dec t(ViewGroup viewGroup, int i) {
        v9f v9f;
        if (i == oba.h) {
            v9f = v9f.a;
        } else if (i == oba.p) {
            v9f = v9f.b;
        } else if (i == oba.i) {
            v9f = v9f.c;
        } else if (i == oba.l) {
            v9f = v9f.o;
        } else {
            throw new IllegalStateException(zr6.h(i, "Unknown viewtype in "));
        }
        return new dec(new x9f(v9f, viewGroup.getContext()));
    }
}
