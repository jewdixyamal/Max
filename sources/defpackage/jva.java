package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: jva  reason: default package */
public final class jva implements bva, qu7 {
    public final je7 X;
    public final je7 Y;
    public final CopyOnWriteArraySet Z = new CopyOnWriteArraySet();
    public final Context a;
    public final av0 b;
    public final o45 c;
    public final je7 o;
    public final AtomicInteger s0;
    public final q0e t0;
    public final ContextScope u0;
    public boolean v0;

    public jva(Context context, je7 je7, je7 je72, je7 je73, av0 av0, kke kke, o45 o45) {
        this.a = context;
        this.b = av0;
        this.c = o45;
        this.o = je7;
        this.X = je72;
        this.Y = je73;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.s0 = atomicInteger;
        q0e a2 = r0e.a(Integer.valueOf(atomicInteger.get()));
        this.t0 = a2;
        ContextScope a3 = j1e.a(new z45(((w9a) kke).d().f(1, "phonebook", 1, 1)).plus(new qj(this)));
        this.u0 = a3;
        e();
        m58 m58 = new m58(a2, 22);
        int i = ft4.o;
        od2.L(new zn5(nu0.Q(m58, z7.R(5, kt4.SECONDS)), new dva(this, (Continuation) null), 5), a3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: wua} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: wua} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: wua} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: wua} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: wua} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: wua} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: wua} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.wua b(defpackage.jva r3, defpackage.wua r4, java.util.List r5) {
        /*
            r3.getClass()
            java.lang.String r3 = r4.X
            java.lang.Long r3 = d(r3)
            r0 = 0
            if (r3 == 0) goto L_0x002d
            java.util.Iterator r4 = r5.iterator()
        L_0x0010:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x002a
            java.lang.Object r5 = r4.next()
            r1 = r5
            wua r1 = (defpackage.wua) r1
            java.lang.String r1 = r1.X
            java.lang.Long r1 = d(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0010
            r0 = r5
        L_0x002a:
            wua r0 = (defpackage.wua) r0
            goto L_0x004b
        L_0x002d:
            java.util.Iterator r3 = r5.iterator()
        L_0x0031:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0049
            java.lang.Object r5 = r3.next()
            r1 = r5
            wua r1 = (defpackage.wua) r1
            java.lang.String r1 = r1.X
            java.lang.String r2 = r4.X
            boolean r1 = defpackage.tpa.f(r2, r1)
            if (r1 == 0) goto L_0x0031
            r0 = r5
        L_0x0049:
            wua r0 = (defpackage.wua) r0
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jva.b(jva, wua, java.util.List):wua");
    }

    public static Long d(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            return null;
        }
        char charAt2 = sb2.charAt(0);
        if (charAt2 != '7') {
            if (charAt2 != '8') {
                return null;
            }
            sb2 = "7".concat(w9e.r0(1, sb2));
        }
        return dae.f0(sb2);
    }

    public final void a() {
        j1e.i(this.u0, (CancellationException) null);
    }

    public final void c() {
        Object value;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "Phonebook", "call checkUpdates from: ".concat(j47.n0(new RuntimeException())), (Throwable) null);
        }
        q0e q0e = this.t0;
        do {
            value = q0e.getValue();
            ((Number) value).intValue();
        } while (!q0e.c(value, Integer.valueOf(this.s0.incrementAndGet())));
    }

    public final void e() {
        if (!((eua) ((f6a) this.X.getValue()).a.getValue()).b(eua.f)) {
            hm9.m("Phonebook", "subscribeOnSystemChanges: no permissions, return", new Object[0]);
        } else if (!this.v0) {
            this.v0 = true;
            this.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new f04(this, new Handler(Looper.getMainLooper())));
        }
    }
}
