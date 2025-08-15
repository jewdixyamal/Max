package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* renamed from: v6g  reason: default package */
public class v6g {
    public static final x6g b = (Build.VERSION.SDK_INT >= 30 ? new n6g() : new m6g()).b().a.a().a.b().a.c();
    public final x6g a;

    public v6g(x6g x6g) {
        this.a = x6g;
    }

    public x6g a() {
        return this.a;
    }

    public x6g b() {
        return this.a;
    }

    public x6g c() {
        return this.a;
    }

    public void d(View view) {
    }

    public tl4 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6g)) {
            return false;
        }
        v6g v6g = (v6g) obj;
        return n() == v6g.n() && m() == v6g.m() && Objects.equals(j(), v6g.j()) && Objects.equals(h(), v6g.h()) && Objects.equals(e(), v6g.e());
    }

    public v27 f(int i) {
        return v27.e;
    }

    public v27 g() {
        return j();
    }

    public v27 h() {
        return v27.e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
    }

    public v27 i() {
        return j();
    }

    public v27 j() {
        return v27.e;
    }

    public v27 k() {
        return j();
    }

    public x6g l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i) {
        return true;
    }

    public void p(v27[] v27Arr) {
    }

    public void q(x6g x6g) {
    }
}
