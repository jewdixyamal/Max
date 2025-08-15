package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: mt6  reason: default package */
public final class mt6 implements n9f {
    public final /* synthetic */ int a;
    public final mi9 b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public mt6(int i) {
        this(mi9.b(), 0);
        this.a = i;
        switch (i) {
            case 1:
                this(mi9.b(), 1);
                return;
            case 2:
                this(mi9.b(), 2);
                return;
            default:
                return;
        }
    }

    public final vh9 F() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b;
        }
    }

    public final o9f J() {
        switch (this.a) {
            case 0:
                return new st6(wma.a(this.b));
            case 1:
                return new gu6(wma.a(this.b));
            case 2:
                return new i8b(wma.a(this.b));
            default:
                return new sdf(wma.a(this.b));
        }
    }

    public fu6 a() {
        Object obj;
        Object obj2;
        Object obj3;
        aa0 aa0 = gu6.X;
        mi9 mi9 = this.b;
        mi9.getClass();
        Object obj4 = null;
        try {
            obj = mi9.h(aa0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            mi9.j(tu6.z, num);
        } else {
            du6 du6 = fu6.A;
            try {
                obj3 = mi9.h(gu6.Y);
            } catch (IllegalArgumentException unused2) {
                obj3 = null;
            }
            if (Objects.equals(obj3, 1)) {
                mi9.j(tu6.z, 4101);
                mi9.j(tu6.A, eu4.c);
            } else {
                mi9.j(tu6.z, 256);
            }
        }
        gu6 gu6 = new gu6(wma.a(mi9));
        ev6.e0(gu6);
        fu6 fu6 = new fu6(gu6);
        try {
            obj2 = mi9.h(ev6.F);
        } catch (IllegalArgumentException unused3) {
            obj2 = null;
        }
        Size size = (Size) obj2;
        if (size != null) {
            fu6.t = new Rational(size.getWidth(), size.getHeight());
        }
        aa0 aa02 = n67.M;
        Object z = ju0.z();
        try {
            z = mi9.h(aa02);
        } catch (IllegalArgumentException unused4) {
        }
        c54.o((Executor) z, "The IO executor can't be null");
        aa0 aa03 = gu6.c;
        if (mi9.a.containsKey(aa03)) {
            Integer num2 = (Integer) mi9.h(aa03);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            } else if (num2.intValue() == 3) {
                try {
                    obj4 = mi9.h(gu6.v0);
                } catch (IllegalArgumentException unused5) {
                }
                if (obj4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return fu6;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [h8b, l9f] */
    public h8b b() {
        i8b i8b = new i8b(wma.a(this.b));
        ev6.e0(i8b);
        ? l9f = new l9f(i8b);
        l9f.q = h8b.y;
        return l9f;
    }

    public final Object c(kic kic) {
        switch (this.a) {
            case 0:
                this.b.j(ev6.J, kic);
                return this;
            case 1:
                this.b.j(ev6.J, kic);
                return this;
            case 2:
                this.b.j(ev6.J, kic);
                return this;
            default:
                this.b.j(ev6.J, kic);
                return this;
        }
    }

    public final Object d(Size size) {
        switch (this.a) {
            case 0:
                this.b.j(ev6.F, size);
                return this;
            case 1:
                this.b.j(ev6.F, size);
                return this;
            case 2:
                this.b.j(ev6.F, size);
                return this;
            default:
                throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }
    }

    public final Object e(int i) {
        switch (this.a) {
            case 0:
                this.b.j(ev6.C, Integer.valueOf(i));
                return this;
            case 1:
                this.b.j(ev6.C, Integer.valueOf(i));
                return this;
            case 2:
                aa0 aa0 = ev6.C;
                Integer valueOf = Integer.valueOf(i);
                mi9 mi9 = this.b;
                mi9.j(aa0, valueOf);
                mi9.j(ev6.D, Integer.valueOf(i));
                return this;
            default:
                this.b.j(ev6.C, Integer.valueOf(i));
                return this;
        }
    }

    public mt6(mi9 mi9, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        this.a = i;
        switch (i) {
            case 1:
                this.b = mi9;
                Object obj5 = null;
                try {
                    obj = mi9.h(cne.e0);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                Class<fu6> cls2 = fu6.class;
                if (cls == null || cls.equals(cls2)) {
                    this.b.j(o9f.o0, q9f.a);
                    aa0 aa0 = cne.e0;
                    mi9 mi92 = this.b;
                    mi92.j(aa0, cls2);
                    try {
                        obj5 = mi92.h(cne.d0);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (obj5 == null) {
                        this.b.j(cne.d0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            case 2:
                this.b = mi9;
                Object obj6 = null;
                try {
                    obj2 = mi9.h(cne.e0);
                } catch (IllegalArgumentException unused3) {
                    obj2 = null;
                }
                Class cls3 = (Class) obj2;
                Class<h8b> cls4 = h8b.class;
                if (cls3 == null || cls3.equals(cls4)) {
                    this.b.j(o9f.o0, q9f.b);
                    aa0 aa02 = cne.e0;
                    mi9 mi93 = this.b;
                    mi93.j(aa02, cls4);
                    try {
                        obj6 = mi93.h(cne.d0);
                    } catch (IllegalArgumentException unused4) {
                    }
                    if (obj6 == null) {
                        this.b.j(cne.d0, cls4.getCanonicalName() + "-" + UUID.randomUUID());
                    }
                    int i2 = -1;
                    try {
                        i2 = mi9.h(ev6.E);
                    } catch (IllegalArgumentException unused5) {
                    }
                    if (((Integer) i2).intValue() == -1) {
                        mi9.j(ev6.E, 2);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
            case 3:
                this.b = mi9;
                if (mi9.a.containsKey(sdf.b)) {
                    Object obj7 = null;
                    try {
                        obj3 = mi9.h(cne.e0);
                    } catch (IllegalArgumentException unused6) {
                        obj3 = null;
                    }
                    Class cls5 = (Class) obj3;
                    Class<rdf> cls6 = rdf.class;
                    if (cls5 == null || cls5.equals(cls6)) {
                        this.b.j(o9f.o0, q9f.o);
                        aa0 aa03 = cne.e0;
                        mi9 mi94 = this.b;
                        mi94.j(aa03, cls6);
                        try {
                            obj7 = mi94.h(cne.d0);
                        } catch (IllegalArgumentException unused7) {
                        }
                        if (obj7 == null) {
                            mi94.j(cne.d0, cls6.getCanonicalName() + "-" + UUID.randomUUID());
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls5);
                }
                throw new IllegalArgumentException("VideoOutput is required");
            default:
                this.b = mi9;
                Object obj8 = null;
                try {
                    obj4 = mi9.h(cne.e0);
                } catch (IllegalArgumentException unused8) {
                    obj4 = null;
                }
                Class cls7 = (Class) obj4;
                Class<pt6> cls8 = pt6.class;
                if (cls7 == null || cls7.equals(cls8)) {
                    this.b.j(o9f.o0, q9f.c);
                    aa0 aa04 = cne.e0;
                    mi9 mi95 = this.b;
                    mi95.j(aa04, cls8);
                    try {
                        obj8 = mi95.h(cne.d0);
                    } catch (IllegalArgumentException unused9) {
                    }
                    if (obj8 == null) {
                        mi95.j(cne.d0, cls8.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls7);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mt6(defpackage.wjf r3) {
        /*
            r2 = this;
            r0 = 3
            r2.a = r0
            mi9 r0 = defpackage.mi9.b()
            aa0 r1 = defpackage.sdf.b
            r0.j(r1, r3)
            r3 = 3
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt6.<init>(wjf):void");
    }
}
