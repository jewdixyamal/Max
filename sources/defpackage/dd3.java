package defpackage;

import java.util.List;

/* renamed from: dd3  reason: default package */
public final class dd3 {
    public zw6 a;
    public crd b;
    public vv4 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public dd3(List list, crd crd, vv4 vv4, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        fm9.e("Audio transmuxing and audio track forcing are not allowed together.", !z2 || !z);
        this.a = zw6.j(list);
        this.b = crd;
        this.c = vv4;
        this.e = z2;
        this.f = z3;
        this.d = z;
        this.g = i;
        this.h = z4;
    }

    public dd3 a() {
        zw6 zw6 = this.a;
        boolean z = this.f;
        int i = this.g;
        return new dd3(zw6, this.b, this.c, this.d, this.e, z, i, this.h && i == 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dd3, java.lang.Object] */
    public dd3 b() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public void c(List list) {
        fm9.e("The composition must contain at least one EditedMediaItemSequence.", !list.isEmpty());
        this.a = zw6.j(list);
    }
}
