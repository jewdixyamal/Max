package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: kw0  reason: default package */
public final class kw0 {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final int c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public final Object i;
    public Object j;
    public BufferedOutputStream k;

    public kw0(hw0 hw0) {
        hw0.getClass();
        this.i = hw0;
        this.b = 5242880;
        this.c = 20480;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                OutputStream outputStream = this.f;
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        maf.h(this.f);
                        this.f = null;
                        File file = this.e;
                        this.e = null;
                        long j2 = this.g;
                        rpd rpd = (rpd) ((hw0) this.i);
                        synchronized (rpd) {
                            if (file.exists()) {
                                if (j2 == 0) {
                                    file.delete();
                                    return;
                                }
                                upd b2 = upd.b(file, j2, rpd.c);
                                b2.getClass();
                                lx0 i2 = rpd.c.i(b2.a);
                                i2.getClass();
                                np8.f(i2.b(b2.b, b2.c));
                                long a2 = ct3.a(i2.e);
                                if (a2 != -1) {
                                    np8.f(b2.b + b2.c <= a2);
                                }
                                rpd.getClass();
                                rpd.b(b2);
                                try {
                                    rpd.c.n();
                                    rpd.notifyAll();
                                    return;
                                } catch (IOException e2) {
                                    throw new IOException(e2);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        maf.h(this.f);
                        this.f = null;
                        File file2 = this.e;
                        this.e = null;
                        file2.delete();
                        throw th;
                    }
                } else {
                    return;
                }
            default:
                OutputStream outputStream2 = this.f;
                if (outputStream2 != null) {
                    try {
                        outputStream2.flush();
                        oaf.h(this.f);
                        this.f = null;
                        File file3 = this.e;
                        this.e = null;
                        long j3 = this.g;
                        spd spd = (spd) ((gw0) this.i);
                        synchronized (spd) {
                            if (file3.exists()) {
                                if (j3 == 0) {
                                    file3.delete();
                                    return;
                                }
                                vpd b3 = vpd.b(file3, j3, -9223372036854775807L, spd.c);
                                b3.getClass();
                                mx0 h2 = spd.c.h(b3.a);
                                h2.getClass();
                                fm9.k(h2.c(b3.b, b3.c));
                                long a3 = dt3.a(h2.e);
                                if (a3 != -1) {
                                    fm9.k(b3.b + b3.c <= a3);
                                }
                                if (spd.d != null) {
                                    try {
                                        spd.d.x(b3.c, file3.getName(), b3.Y);
                                    } catch (IOException e3) {
                                        throw new IOException(e3);
                                    } catch (IOException e4) {
                                        throw new IOException(e4);
                                    }
                                }
                                spd.b(b3);
                                spd.c.o();
                                spd.notifyAll();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        oaf.h(this.f);
                        this.f = null;
                        File file4 = this.e;
                        this.e = null;
                        file4.delete();
                        throw th2;
                    }
                } else {
                    return;
                }
        }
    }

    public void b(z24 z24) {
        File c2;
        z24 z242 = z24;
        long j2 = z242.g;
        long min = j2 == -1 ? -1 : Math.min(j2 - this.h, this.d);
        String str = z242.h;
        int i2 = maf.a;
        long j3 = z242.f + this.h;
        rpd rpd = (rpd) ((hw0) this.i);
        synchronized (rpd) {
            try {
                rpd.d();
                lx0 i3 = rpd.c.i(str);
                i3.getClass();
                np8.f(i3.b(j3, min));
                if (!rpd.a.exists()) {
                    rpd.e(rpd.a);
                    rpd.k();
                }
                re7 re7 = rpd.b;
                if (min != -1) {
                    re7.a(rpd, min);
                } else {
                    re7.getClass();
                }
                File file = new File(rpd.a, Integer.toString(rpd.e.nextInt(10)));
                if (!file.exists()) {
                    rpd.e(file);
                }
                c2 = upd.c(file, i3.a, j3, System.currentTimeMillis());
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e = c2;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            bkc bkc = (bkc) this.k;
            if (bkc == null) {
                this.k = new bkc(fileOutputStream, this.c, 0);
            } else {
                bkc.a(fileOutputStream);
            }
            this.f = (bkc) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0;
    }

    public void c(a34 a34) {
        File c2;
        a34 a342 = a34;
        long j2 = a342.g;
        long j3 = -1;
        if (j2 != -1) {
            j3 = Math.min(j2 - this.h, this.d);
        }
        long j4 = j3;
        String str = a342.h;
        int i2 = oaf.a;
        long j5 = a342.f + this.h;
        spd spd = (spd) ((gw0) this.i);
        synchronized (spd) {
            try {
                spd.d();
                mx0 h2 = spd.c.h(str);
                h2.getClass();
                fm9.k(h2.c(j5, j4));
                if (!spd.a.exists()) {
                    spd.e(spd.a);
                    spd.n();
                }
                spd.b.c(spd, str, j5, j4);
                File file = new File(spd.a, Integer.toString(spd.f.nextInt(10)));
                if (!file.exists()) {
                    spd.e(file);
                }
                c2 = vpd.c(file, h2.a, j5, System.currentTimeMillis());
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e = c2;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        if (this.c > 0) {
            bkc bkc = (bkc) this.k;
            if (bkc == null) {
                this.k = new bkc(fileOutputStream, this.c, 1);
            } else {
                bkc.a(fileOutputStream);
            }
            this.f = (bkc) this.k;
        } else {
            this.f = fileOutputStream;
        }
        this.g = 0;
    }

    public kw0(gw0 gw0) {
        gw0.getClass();
        this.i = gw0;
        this.b = 5242880;
        this.c = 20480;
    }
}
