package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;

/* renamed from: w82  reason: default package */
public final class w82 implements l3a {
    public Object X;
    public int a;
    public long b;
    public long c;
    public Object o;

    public static wh3 b(kdg kdg, a aVar, int i) {
        vig vig = aVar.F0;
        wh3 wh3 = vig == null ? null : vig.o;
        if (wh3 != null && wh3.b) {
            int[] iArr = wh3.o;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = wh3.Y;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    }
                }
            }
            if (kdg.n < wh3.X) {
                return wh3;
            }
            return null;
        }
        return null;
    }

    public x82 a() {
        if (((List) this.X) == null) {
            this.X = Collections.emptyList();
        }
        return new x82((d92) this.o, this.a, this.b, this.c, (List) this.X);
    }

    public void l(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        if (((ie6) this.o).a()) {
            xmc xmc = (xmc) wmc.h().a;
            if (xmc == null || xmc.b) {
                kdg kdg = (kdg) ((ie6) this.o).u0.get((zk) this.X);
                if (kdg != null) {
                    ok okVar = kdg.d;
                    if (okVar instanceof a) {
                        a aVar = (a) okVar;
                        long j2 = 0;
                        boolean z = true;
                        boolean z2 = this.b > 0;
                        int i8 = aVar.A0;
                        if (xmc != null) {
                            boolean z3 = z2 & xmc.c;
                            int i9 = xmc.o;
                            int i10 = xmc.X;
                            i3 = xmc.a;
                            if (aVar.F0 != null && !aVar.c()) {
                                wh3 b2 = b(kdg, aVar, this.a);
                                if (b2 != null) {
                                    if (!b2.c || this.b <= 0) {
                                        z = false;
                                    }
                                    i10 = b2.X;
                                    z3 = z;
                                } else {
                                    return;
                                }
                            }
                            i2 = i9;
                            i = i10;
                        } else {
                            i3 = 0;
                            i = 100;
                            i2 = 5000;
                        }
                        ie6 ie6 = (ie6) this.o;
                        if (task.h()) {
                            i5 = 0;
                            i4 = 0;
                        } else {
                            if (((ukg) task).d) {
                                i5 = 100;
                            } else {
                                Exception e = task.e();
                                if (e instanceof ApiException) {
                                    Status status = ((ApiException) e).a;
                                    i7 = status.a;
                                    ph3 ph3 = status.o;
                                    if (ph3 != null) {
                                        i4 = ph3.b;
                                        i5 = i7;
                                    }
                                } else {
                                    i7 = HttpStatus.SC_SWITCHING_PROTOCOLS;
                                }
                                i5 = i7;
                            }
                            i4 = -1;
                        }
                        if (z2) {
                            long j3 = this.b;
                            long j4 = this.c;
                            long currentTimeMillis = System.currentTimeMillis();
                            i6 = (int) (SystemClock.elapsedRealtime() - j4);
                            j = j3;
                            j2 = currentTimeMillis;
                        } else {
                            j = 0;
                            i6 = -1;
                        }
                        y99 y99 = new y99(this.a, i5, i4, j, j2, (String) null, (String) null, i8, i6);
                        ie6.getClass();
                        tdg tdg = new tdg(y99, i3, (long) i2, i);
                        fc9 fc9 = ie6.x0;
                        fc9.sendMessage(fc9.obtainMessage(18, tdg));
                    }
                }
            }
        }
    }
}
