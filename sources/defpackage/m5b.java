package defpackage;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m5b  reason: default package */
public final class m5b {
    public final bg7 a;
    public pq8 b;
    public go0 c;
    public pq8 d;
    public wm5 e;
    public pq8 f;
    public y7g g;
    public sh0 h;
    public ja6 i;

    public m5b(bg7 bg7) {
        this.a = bg7;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [go0, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.go0 a() {
        /*
            r6 = this;
            go0 r0 = r6.c
            if (r0 != 0) goto L_0x008d
            bg7 r0 = r6.a
            java.lang.Object r1 = r0.j
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -1868884870: goto L_0x003d;
                case -1106578487: goto L_0x0033;
                case -404562712: goto L_0x0029;
                case -402149703: goto L_0x001f;
                case 95945896: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0047
        L_0x0015:
            java.lang.String r2 = "dummy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0047
            r1 = 0
            goto L_0x0048
        L_0x001f:
            java.lang.String r2 = "dummy_with_tracking"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0047
            r1 = r5
            goto L_0x0048
        L_0x0029:
            java.lang.String r2 = "experimental"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0047
            r1 = r4
            goto L_0x0048
        L_0x0033:
            java.lang.String r2 = "legacy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0047
            r1 = 4
            goto L_0x0048
        L_0x003d:
            java.lang.String r2 = "legacy_default_params"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0047
            r1 = r3
            goto L_0x0048
        L_0x0047:
            r1 = -1
        L_0x0048:
            if (r1 == 0) goto L_0x0086
            if (r1 == r5) goto L_0x007e
            if (r1 == r4) goto L_0x0070
            java.lang.Object r2 = r0.c
            rq9 r2 = (defpackage.rq9) r2
            java.lang.Object r4 = r0.e
            qq9 r4 = (defpackage.qq9) r4
            if (r1 == r3) goto L_0x0064
            rs0 r1 = new rs0
            java.lang.Object r0 = r0.b
            n5b r0 = (defpackage.n5b) r0
            r1.<init>(r4, r0, r2)
            r6.c = r1
            goto L_0x008d
        L_0x0064:
            rs0 r0 = new rs0
            n5b r1 = defpackage.n84.a()
            r0.<init>(r4, r1, r2)
            r6.c = r0
            goto L_0x008d
        L_0x0070:
            lw7 r1 = new lw7
            rq9 r2 = defpackage.rq9.o()
            int r0 = r0.a
            r1.<init>(r0, r2)
            r6.c = r1
            goto L_0x008d
        L_0x007e:
            et4 r0 = new et4
            r0.<init>()
            r6.c = r0
            goto L_0x008d
        L_0x0086:
            ys4 r0 = new ys4
            r0.<init>()
            r6.c = r0
        L_0x008d:
            go0 r6 = r6.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5b.a():go0");
    }

    public final wm5 b() {
        if (this.e == null) {
            bg7 bg7 = this.a;
            this.e = new wm5((qq9) bg7.e, (n5b) bg7.d);
        }
        return this.e;
    }

    public final y7g c(int i2) {
        pq8 pq8;
        if (this.g == null) {
            bg7 bg7 = this.a;
            Class<o5b> cls = o5b.class;
            Class<n5b> cls2 = n5b.class;
            Class<sq8> cls3 = sq8.class;
            if (i2 == 0) {
                if (this.f == null) {
                    try {
                        this.f = NativeMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{(qq9) bg7.e, (n5b) bg7.f, (rq9) bg7.g});
                    } catch (ClassNotFoundException e2) {
                        ta5.c("PoolFactory", "", e2);
                        this.f = null;
                    } catch (IllegalAccessException e3) {
                        ta5.c("PoolFactory", "", e3);
                        this.f = null;
                    } catch (InstantiationException e4) {
                        ta5.c("PoolFactory", "", e4);
                        this.f = null;
                    } catch (NoSuchMethodException e5) {
                        ta5.c("PoolFactory", "", e5);
                        this.f = null;
                    } catch (InvocationTargetException e6) {
                        ta5.c("PoolFactory", "", e6);
                        this.f = null;
                    }
                }
                pq8 = this.f;
            } else if (i2 == 1) {
                if (this.d == null) {
                    try {
                        this.d = BufferMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{(qq9) bg7.e, (n5b) bg7.f, (rq9) bg7.g});
                    } catch (ClassNotFoundException unused) {
                        this.d = null;
                    } catch (IllegalAccessException unused2) {
                        this.d = null;
                    } catch (InstantiationException unused3) {
                        this.d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.d = null;
                    } catch (InvocationTargetException unused5) {
                        this.d = null;
                    }
                }
                pq8 = this.d;
            } else if (i2 == 2) {
                if (this.b == null) {
                    try {
                        this.b = AshmemMemoryChunkPool.class.getConstructor(new Class[]{cls3, cls2, cls}).newInstance(new Object[]{(qq9) bg7.e, (n5b) bg7.f, (rq9) bg7.g});
                    } catch (ClassNotFoundException unused6) {
                        this.b = null;
                    } catch (IllegalAccessException unused7) {
                        this.b = null;
                    } catch (InstantiationException unused8) {
                        this.b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.b = null;
                    } catch (InvocationTargetException unused10) {
                        this.b = null;
                    }
                }
                pq8 = this.b;
            } else {
                throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
            od2.o(pq8, "failed to get pool for chunk type: " + i2);
            this.g = new y7g((Object) pq8, 24, (Object) d());
        }
        return this.g;
    }

    public final sh0 d() {
        if (this.h == null) {
            if (this.i == null) {
                bg7 bg7 = this.a;
                this.i = new ja6((qq9) bg7.e, (n5b) bg7.h, (rq9) bg7.i);
            }
            this.h = new sh0(this.i);
        }
        return this.h;
    }
}
