package defpackage;

import android.content.res.Resources;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;

/* renamed from: wie  reason: default package */
public final class wie extends ffe implements a66 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ xie s0;
    public final /* synthetic */ boolean t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wie(xie xie, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s0 = xie;
        this.t0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wie) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wie wie = new wie(this.s0, this.t0, continuation);
        wie.Z = obj;
        return wie;
    }

    public final Object o(Object obj) {
        long j;
        sx3 sx3;
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 = (sx3) this.Z;
            hm9.m(this.s0.a, "start init vendor services", new Object[0]);
            j = System.nanoTime();
            xie xie = this.s0;
            this.Z = sx3;
            this.X = j;
            this.Y = 1;
            ((xe6) xie.g()).c.getValue();
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            j = this.X;
            sx3 = (sx3) this.Z;
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = 4;
        switch (Resources.getSystem().getDisplayMetrics().densityDpi) {
            case 120:
                i2 = 1;
                break;
            case 140:
            case 160:
                i2 = 2;
                break;
            case 180:
            case 200:
            case 220:
            case 240:
                i2 = 3;
                break;
            case 260:
            case 280:
            case HttpStatus.SC_MULTIPLE_CHOICES:
            case 320:
                break;
            case 340:
            case 360:
            case HttpStatus.SC_BAD_REQUEST:
            case HttpStatus.SC_METHOD_FAILURE:
            case 440:
            case 480:
                i2 = 5;
                break;
            case 560:
            case 600:
            case 640:
                i2 = 6;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 != 0) {
            String str = this.s0.a;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "Density is ".concat(ms2.o(i2)), (Throwable) null);
            }
            ((np) this.s0.c()).getClass();
            if (((kye) np.d.getValue()) != null) {
                String o = ms2.o(i2);
                kye kye = kye.a;
                Map singletonMap = Collections.singletonMap("density", o);
                if (!kye.b) {
                    try {
                        kbd kbd = kye.e;
                        if (kbd == null) {
                            kbd = null;
                        }
                        kbd.f(singletonMap);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        ty3 c = this.s0.c();
        ((x6a) this.s0.o.getValue()).getClass();
        c.b("version_code", String.valueOf(6392));
        ty3 c2 = this.s0.c();
        ((x6a) this.s0.o.getValue()).getClass();
        ((np) c2).getClass();
        try {
            Field declaredField = nec.a(ju0.class).a().getDeclaredField("LIMIT_MAX_NON_FATALS_PER_SESSION");
            declaredField.setAccessible(true);
            declaredField.set((Object) null, 32);
        } catch (Throwable unused2) {
        }
        nu0.z(new zn5(od2.x(((hyc) this.s0.b()).u()), new uie(this.s0, (Continuation) null), 5), sx3);
        j47.T(sx3, (lx3) null, (vx3) null, new vie(this.s0, (Continuation) null), 3);
        String str2 = this.s0.a;
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us7 = us7.X;
            int i3 = ft4.o;
            ir62.d(us7, str2, "init time ".concat(ft4.j(z7.S(System.nanoTime() - j, kt4.NANOSECONDS))), (Throwable) null);
        }
        if (this.t0) {
            xie xie2 = this.s0;
            this.Z = null;
            this.Y = 2;
            hm9.m(xie2.a, "checkTokenChanged", new Object[0]);
            String string = ((hyc) xie2.b()).g.getString("user.fcmToken", (String) null);
            if (string == null || string.length() == 0 || (obj2 = xie2.e(new qie(string, xie2), this)) != tx3) {
                obj2 = e5f;
            }
            if (obj2 == tx3) {
                return tx3;
            }
        }
        return e5f;
    }
}
