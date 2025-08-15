package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: knb  reason: default package */
public final class knb {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public boolean g;
    public final ja6 h;

    public knb(ja6 ja6) {
        ja6.getClass();
        this.h = ja6;
    }

    public final boolean a(p5b p5b) {
        int read;
        int i = this.e;
        while (this.a != 6 && (read = p5b.read()) != -1) {
            try {
                int i2 = this.c;
                this.c = i2 + 1;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i3 = this.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.a = 5;
                                } else if (i3 != 5) {
                                    od2.p(false);
                                } else {
                                    int i4 = ((this.b << 8) + read) - 2;
                                    od2.V(p5b, (long) i4);
                                    this.c += i4;
                                    this.a = 2;
                                }
                            } else if (read == 255) {
                                this.a = 3;
                            } else if (read == 0) {
                                this.a = 2;
                            } else if (read == 217) {
                                this.g = true;
                                int i5 = i2 - 1;
                                int i6 = this.d;
                                if (i6 > 0) {
                                    this.f = i5;
                                }
                                this.d = i6 + 1;
                                this.e = i6;
                                this.a = 2;
                            } else {
                                if (read == 218) {
                                    int i7 = i2 - 1;
                                    int i8 = this.d;
                                    if (i8 > 0) {
                                        this.f = i7;
                                    }
                                    this.d = i8 + 1;
                                    this.e = i8;
                                }
                                if (read != 1) {
                                    if (read < 208 || read > 215) {
                                        if (!(read == 217 || read == 216)) {
                                            this.a = 4;
                                        }
                                    }
                                }
                                this.a = 2;
                            }
                        } else if (read == 255) {
                            this.a = 3;
                        }
                    } else if (read == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (read == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = read;
            } catch (IOException e2) {
                nu0.H(e2);
                throw null;
            }
        }
        return (this.a == 6 || this.e == i) ? false : true;
    }

    public final boolean b(g05 g05) {
        if (this.a == 6 || g05.o() <= this.c) {
            return false;
        }
        InputStream n = g05.n();
        n.getClass();
        ja6 ja6 = this.h;
        p5b p5b = new p5b(n, (byte[]) ja6.get(16384), ja6);
        try {
            od2.V(p5b, (long) this.c);
            boolean a2 = a(p5b);
            q43.b(p5b);
            return a2;
        } catch (IOException e2) {
            nu0.H(e2);
            throw null;
        } catch (Throwable th) {
            q43.b(p5b);
            throw th;
        }
    }
}
