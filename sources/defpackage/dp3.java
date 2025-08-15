package defpackage;

import android.media.MediaDrmException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: dp3  reason: default package */
public final class dp3 implements l30, fu3, ed6, s65, df9, edc {
    public static final p4c X = new p4c(19);
    public static final /* synthetic */ dp3 Y = new Object();
    public static final dp3 a = new Object();
    public static volatile l7b b;
    public static final dp3 c = new Object();
    public static final dp3 o = new Object();

    public static boolean b(o97 o97) {
        l7b l7b = b;
        if (l7b == null) {
            throw new IllegalStateException("Tracer settings are not initialized.");
        } else if (ju0.b(l7b, "system.shutdown.until.ts")) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder("system.");
            sb.append(o97.b);
            sb.append(".shutdown.until.ts");
            return ju0.b(l7b, sb.toString());
        }
    }

    public static hdb c(String str) {
        v25 v25 = hdb.Z;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            hdb hdb = (hdb) u1Var.next();
            if (tpa.f(hdb.a, str)) {
                return hdb;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    public q65 d() {
        throw new IllegalStateException();
    }

    public pz3 f(byte[] bArr) {
        throw new IllegalStateException();
    }

    public byte[] g() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public boolean i(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    public void j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void k(byte[] bArr) {
    }

    public byte[] l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void m(byte[] bArr) {
        throw new IllegalStateException();
    }

    public o65 n(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    public int o() {
        return 1;
    }

    public void p(sy4 sy4) {
    }

    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudArr) {
        if (!(unsatisfiedLinkError instanceof mud) || (unsatisfiedLinkError instanceof lud)) {
            return false;
        }
        String str = ((mud) unsatisfiedLinkError).a;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (p5f p5f : nudArr) {
            if (p5f instanceof p5f) {
                p5f p5f2 = p5f;
                if (!(p5f2 instanceof of0)) {
                    try {
                        p5f2.getClass();
                        p5f2.d(2);
                    } catch (Exception unused) {
                        p5f2.getClass();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public Object r(gy8 gy8) {
        long j = 0;
        try {
            j = lz7.M(gy8, 0);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s != 0) {
                if (s != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }

    public void release() {
    }

    public Object u(Task task) {
        if (task.h()) {
            return (Bundle) task.f();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(task.e()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.e());
    }
}
