package defpackage;

import java.io.File;

/* renamed from: g7f  reason: default package */
public final /* synthetic */ class g7f implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly8 b;

    public /* synthetic */ g7f(ly8 ly8, int i) {
        this.a = i;
        this.b = ly8;
    }

    public final void accept(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        j10 j10 = (j10) obj;
        switch (this.a) {
            case 0:
                j10.k = 100.0f;
                j10.i = d20.c;
                ly8 ly8 = this.b;
                v6f v6f = ly8.a;
                String str = v6f.b;
                j10.m = str;
                j10.u = pag.u(str);
                g20 g20 = j10.a;
                int i = g20 == null ? -1 : h7f.$EnumSwitchMapping$0[g20.ordinal()];
                p8f p8f = v6f.h;
                if (i == 1) {
                    x10 x10 = j10.b;
                    if (x10 == null) {
                        x10 = x10.w0;
                    }
                    w10 b2 = x10.b();
                    b2.g = p8f.a;
                    j10.b = new x10(b2);
                    return;
                } else if (i == 2) {
                    i10 i10 = j10.e;
                    if (i10 == null) {
                        i10 = i10.j;
                    }
                    h10 a2 = i10.a();
                    a2.e = p8f.a;
                    a2.a = p8f.b;
                    j10.e = new i10(a2);
                    return;
                } else if (i == 3) {
                    h20 a3 = j10.c().a();
                    a3.a = p8f.b;
                    a3.l = p8f.a;
                    j10.d = new k20(a3);
                    return;
                } else if (i == 4) {
                    r10 a4 = j10.b().a();
                    a4.a = p8f.b;
                    a4.d = p8f.a;
                    j10.r = new s10(a4);
                    return;
                } else if (i != 5) {
                    hm9.p("UploadDraftMediaWorker", "Unknown attach type " + j10.a, (Throwable) null);
                    return;
                } else {
                    j10.f = iz7.s(ly8.b);
                    return;
                }
            case 1:
                j10.i = d20.X;
                v6f v6f2 = this.b.a;
                d7f d7f = v6f2.a;
                j10.m = d7f.a;
                j10.u = d7f.b;
                j10.k = v6f2.e;
                j10.o = v6f2.f;
                return;
            default:
                j10.k = 100.0f;
                j10.i = d20.c;
                g20 g202 = j10.a;
                int i2 = g202 == null ? -1 : u7f.$EnumSwitchMapping$0[g202.ordinal()];
                ly8 ly82 = this.b;
                v6f v6f3 = ly82.a;
                if (i2 == 1) {
                    String str2 = v6f3.h.a;
                    x10 x102 = j10.b;
                    if (x102 == null) {
                        x102 = x10.w0;
                    }
                    w10 b3 = x102.b();
                    b3.g = str2;
                    j10.b = new x10(b3);
                    String str3 = v6f3.b;
                    j10.m = str3;
                    try {
                        obj2 = Long.valueOf(new File(str3).lastModified());
                    } catch (Throwable th) {
                        obj2 = new njc(th);
                    }
                    if (obj2 instanceof njc) {
                        obj2 = 0L;
                    }
                    j10.u = ((Number) obj2).longValue();
                    return;
                } else if (i2 == 2) {
                    p8f p8f2 = v6f3.h;
                    long j = p8f2.b;
                    i10 i102 = j10.e;
                    if (i102 == null) {
                        i102 = i10.j;
                    }
                    h10 a5 = i102.a();
                    a5.e = p8f2.a;
                    a5.a = j;
                    j10.e = new i10(a5);
                    String str4 = v6f3.b;
                    j10.m = str4;
                    try {
                        obj3 = Long.valueOf(new File(str4).lastModified());
                    } catch (Throwable th2) {
                        obj3 = new njc(th2);
                    }
                    if (obj3 instanceof njc) {
                        obj3 = 0L;
                    }
                    j10.u = ((Number) obj3).longValue();
                    return;
                } else if (i2 == 3) {
                    p8f p8f3 = v6f3.h;
                    long j2 = p8f3.b;
                    h20 a6 = j10.c().a();
                    a6.a = j2;
                    a6.l = p8f3.a;
                    j10.d = new k20(a6);
                    String str5 = v6f3.b;
                    j10.m = str5;
                    try {
                        obj4 = Long.valueOf(new File(str5).lastModified());
                    } catch (Throwable th3) {
                        obj4 = new njc(th3);
                    }
                    if (obj4 instanceof njc) {
                        obj4 = 0L;
                    }
                    j10.u = ((Number) obj4).longValue();
                    return;
                } else if (i2 == 4) {
                    p8f p8f4 = v6f3.h;
                    long j3 = p8f4.b;
                    r10 a7 = j10.b().a();
                    a7.a = j3;
                    a7.d = p8f4.a;
                    j10.r = new s10(a7);
                    String str6 = v6f3.b;
                    j10.m = str6;
                    try {
                        obj5 = Long.valueOf(new File(str6).lastModified());
                    } catch (Throwable th4) {
                        obj5 = new njc(th4);
                    }
                    if (obj5 instanceof njc) {
                        obj5 = 0L;
                    }
                    j10.u = ((Number) obj5).longValue();
                    return;
                } else if (i2 == 5) {
                    j10.f = iz7.s(ly82.b);
                    String str7 = v6f3.b;
                    j10.m = str7;
                    try {
                        obj6 = Long.valueOf(new File(str7).lastModified());
                    } catch (Throwable th5) {
                        obj6 = new njc(th5);
                    }
                    if (obj6 instanceof njc) {
                        obj6 = 0L;
                    }
                    j10.u = ((Number) obj6).longValue();
                    return;
                } else {
                    return;
                }
        }
    }
}
