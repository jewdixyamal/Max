package defpackage;

import android.view.View;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: dk  reason: default package */
public final class dk implements l78, m78 {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a = 3;
    public boolean b;
    public boolean c;
    public Object o;

    public /* synthetic */ dk() {
    }

    public boolean I() {
        if (this.b) {
            ((fh8) this.o).getClass();
            return false;
        }
        m78 m78 = (m78) this.Z;
        m78.getClass();
        return m78.I();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kua, java.lang.Object] */
    public kua a() {
        ? obj = new Object();
        obj.a = (CharSequence) this.o;
        obj.b = (IconCompat) this.X;
        obj.c = (String) this.Y;
        obj.d = (String) this.Z;
        obj.e = this.b;
        obj.f = this.c;
        return obj;
    }

    public b3b d() {
        l78 l78 = (l78) this.Z;
        if (l78 != null) {
            return l78.d();
        }
        return (b3b) ((fh8) this.o).Y;
    }

    public void f(c3b c3b) {
        m78 m78 = (m78) this.Z;
        if (m78 != null) {
            m78.f(c3b);
            c3b = ((m78) this.Z).d();
        }
        ((fh8) this.o).f(c3b);
    }

    public long t() {
        switch (this.a) {
            case 1:
                if (this.b) {
                    return ((fh8) this.o).t();
                }
                l78 l78 = (l78) this.Z;
                l78.getClass();
                return l78.t();
            default:
                if (this.b) {
                    return ((fh8) this.o).t();
                }
                m78 m78 = (m78) this.Z;
                m78.getClass();
                return m78.t();
        }
    }

    public void u(b3b b3b) {
        l78 l78 = (l78) this.Z;
        if (l78 != null) {
            l78.u(b3b);
            b3b = ((l78) this.Z).d();
        }
        ((fh8) this.o).u(b3b);
    }

    public dk(View view, bk bkVar, l lVar) {
        this.o = view;
        this.X = bkVar;
        this.Y = lVar;
        view.addOnAttachStateChangeListener(new ck(0, this));
    }

    /* renamed from: d  reason: collision with other method in class */
    public c3b m57d() {
        m78 m78 = (m78) this.Z;
        if (m78 != null) {
            return m78.d();
        }
        return (c3b) ((fh8) this.o).Y;
    }

    public dk(f85 f85, rhe rhe) {
        this.X = f85;
        this.o = new fh8(rhe);
        this.b = true;
    }

    public dk(gc4 gc4, she she) {
        this.X = gc4;
        this.o = new fh8(she);
        this.b = true;
    }
}
