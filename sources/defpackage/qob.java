package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* renamed from: qob  reason: default package */
public final class qob implements ny9 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final kf5 g;
    public static final kf5 h;
    public static final ma7 i = new ma7(1);
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final my9 d;
    public final rob e = new rob(this);

    static {
        Class<pob> cls = pob.class;
        g = new kf5("key", au1.o(au1.n(cls, new jy(1))));
        h = new kf5("value", au1.o(au1.n(cls, new jy(2))));
    }

    public qob(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, my9 my9) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = my9;
    }

    public static int g(kf5 kf5) {
        pob pob = (pob) ((Annotation) kf5.b.get(pob.class));
        if (pob != null) {
            return ((jy) pob).a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final ny9 a(kf5 kf5, Object obj) {
        c(kf5, obj, true);
        return this;
    }

    public final void b(kf5 kf5, int i2, boolean z) {
        if (!z || i2 != 0) {
            pob pob = (pob) ((Annotation) kf5.b.get(pob.class));
            if (pob != null) {
                h(((jy) pob).a << 3);
                h(i2);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void c(kf5 kf5, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    h((g(kf5) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    h(bytes.length);
                    this.a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object c2 : (Collection) obj) {
                    c(kf5, c2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry f2 : ((Map) obj).entrySet()) {
                    f(i, kf5, f2, false);
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != 0.0d) {
                    h((g(kf5) << 3) | 1);
                    this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                }
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    h((g(kf5) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z || longValue != 0) {
                    pob pob = (pob) ((Annotation) kf5.b.get(pob.class));
                    if (pob != null) {
                        h(((jy) pob).a << 3);
                        i(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                b(kf5, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    h((g(kf5) << 3) | 2);
                    h(bArr.length);
                    this.a.write(bArr);
                }
            } else {
                my9 my9 = (my9) this.b.get(obj.getClass());
                if (my9 != null) {
                    f(my9, kf5, obj, z);
                    return;
                }
                waf waf = (waf) this.c.get(obj.getClass());
                if (waf != null) {
                    rob rob = this.e;
                    rob.a = false;
                    rob.c = kf5;
                    rob.b = z;
                    waf.a(obj, rob);
                } else if (obj instanceof mob) {
                    b(kf5, ((mob) obj).a(), true);
                } else if (obj instanceof Enum) {
                    b(kf5, ((Enum) obj).ordinal(), true);
                } else {
                    f(this.d, kf5, obj, z);
                }
            }
        }
    }

    public final ny9 d(kf5 kf5, int i2) {
        b(kf5, i2, true);
        return this;
    }

    public final ny9 e(kf5 kf5, long j) {
        if (j != 0) {
            pob pob = (pob) ((Annotation) kf5.b.get(pob.class));
            if (pob != null) {
                h(((jy) pob).a << 3);
                i(j);
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, rf7] */
    public final void f(my9 my9, kf5 kf5, Object obj, boolean z) {
        OutputStream outputStream;
        ? outputStream2 = new OutputStream();
        outputStream2.a = 0;
        try {
            outputStream = this.a;
            this.a = outputStream2;
            my9.a(obj, this);
            this.a = outputStream;
            long j = outputStream2.a;
            outputStream2.close();
            if (!z || j != 0) {
                h((g(kf5) << 3) | 2);
                i(j);
                my9.a(obj, this);
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void h(int i2) {
        while (((long) (i2 & -128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void i(long j) {
        while ((-128 & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
