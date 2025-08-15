package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ax7  reason: default package */
public final class ax7 {
    public final kke a;
    public final je7 b;
    public final je7 c;
    public final ContextScope d;
    public final qi9 e = new qi9();
    public final LinkedHashMap f = new LinkedHashMap();
    public long g = -1;
    public boolean h = true;
    public boolean i;

    public ax7(je7 je7, je7 je72, kke kke) {
        this.a = kke;
        this.b = je7;
        this.c = je72;
        this.d = j1e.a(((w9a) kke).b());
        long[] jArr = usc.a;
    }

    public final void a(List list) {
        cta cta = cta.CHAT_INIT_TO_RENDER;
        qi9 qi9 = this.e;
        bta bta = (bta) qi9.f(cta);
        if (bta != null && bta.e == -1) {
            bta bta2 = (bta) qi9.f(cta);
            if (bta2 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bta2.e = elapsedRealtime - bta2.b;
                bta2.h = list;
                f(elapsedRealtime);
            }
            if (!this.i) {
                this.g = ((t33) ((q33) this.b.getValue())).F();
            }
            ((ita) this.c.getValue()).d(1, 0);
        }
    }

    public final void b(List list) {
        cta cta = cta.CHATS_INIT_TO_RENDER;
        qi9 qi9 = this.e;
        bta bta = (bta) qi9.f(cta);
        if (bta != null && bta.e == -1) {
            bta bta2 = (bta) qi9.f(cta);
            if (bta2 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bta2.e = elapsedRealtime - bta2.b;
                bta2.h = list;
                bta bta3 = (bta) qi9.f(cta.FOLDERS_INIT_TO_RENDER);
                if (bta3 == null || bta3.e != -1) {
                    f(elapsedRealtime);
                }
            }
            ((ita) this.c.getValue()).e(1, 0);
        }
    }

    public final eta c(zsa zsa) {
        kl7 kl7;
        bta bta;
        cta cta = cta.MAIN_ACTIVITY_INIT_TO_RENDER;
        qi9 qi9 = this.e;
        bta bta2 = (bta) qi9.f(cta);
        long j = 0;
        if (bta2 != null) {
            if (!this.h) {
                bta2 = null;
            }
            if (bta2 != null) {
                bta2.f = 0;
                j = 1;
            }
        }
        cta cta2 = cta.FOLDERS_INIT_TO_RENDER;
        bta bta3 = (bta) qi9.f(cta2);
        zsa zsa2 = zsa.EVENT_OPEN_CHATS;
        long j2 = -1;
        if (bta3 != null) {
            if (zsa != zsa2) {
                bta3 = null;
            }
            if (bta3 != null) {
                bta3.f = j;
                j++;
                if (this.h) {
                    bta bta4 = (bta) qi9.f(cta);
                    bta3.g = bta4 != null ? bta4.f : -1;
                }
            }
        }
        cta cta3 = cta.CHATS_INIT_TO_RENDER;
        bta bta5 = (bta) qi9.f(cta3);
        if (bta5 != null) {
            if (zsa != zsa2) {
                bta5 = null;
            }
            if (bta5 != null) {
                bta5.f = j;
                j++;
                if (this.h) {
                    bta bta6 = (bta) qi9.f(cta);
                    bta5.g = bta6 != null ? bta6.f : -1;
                }
            }
        }
        cta cta4 = cta.CHAT_INIT_TO_RENDER;
        bta bta7 = (bta) qi9.f(cta4);
        if (bta7 != null) {
            if (zsa != zsa.EVENT_OPEN_CHAT) {
                bta7 = null;
            }
            if (bta7 != null) {
                bta7.f = j;
                if (this.h) {
                    bta bta8 = (bta) qi9.f(cta);
                    bta7.g = bta8 != null ? bta8.f : -1;
                }
            }
        }
        int ordinal = zsa.ordinal();
        if (ordinal == 1) {
            kl7 l = j1e.l();
            if (!this.h) {
                return null;
            }
            bta bta9 = (bta) qi9.f(cta);
            if (bta9 != null) {
                j2 = bta9.e;
                l.add(bta9);
            }
            bta bta10 = (bta) qi9.f(cta2);
            if (bta10 != null) {
                l.add(bta10);
            }
            bta bta11 = (bta) qi9.f(cta3);
            if (bta11 != null) {
                l.add(bta11);
            }
            kl7 = j1e.d(l);
        } else if (ordinal != 2) {
            return null;
        } else {
            kl7 l2 = j1e.l();
            if (this.h && (bta = (bta) qi9.f(cta)) != null) {
                j2 = bta.e;
                l2.add(bta);
            }
            bta bta12 = (bta) qi9.f(cta4);
            if (bta12 == null) {
                return null;
            }
            if (!this.h) {
                j2 = bta12.e;
            }
            l2.add(bta12);
            kl7 = j1e.d(l2);
        }
        this.h = false;
        return new eta(j2, kl7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.content.Intent r3) {
        /*
            r2 = this;
            java.lang.String r3 = r3.getAction()
            if (r3 == 0) goto L_0x0037
            int r0 = r3.hashCode()
            r1 = -1173447682(0xffffffffba0e9bfe, float:-5.440115E-4)
            if (r0 == r1) goto L_0x002c
            r1 = -1173264947(0xffffffffba1165cd, float:-5.5464805E-4)
            if (r0 == r1) goto L_0x0023
            r1 = -58484670(0xfffffffffc839842, float:-5.4662324E36)
            if (r0 == r1) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0023:
            java.lang.String r0 = "android.intent.action.SEND"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0037
            goto L_0x0035
        L_0x002c:
            java.lang.String r0 = "android.intent.action.MAIN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            r2.i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax7.d(android.content.Intent):void");
    }

    public final void e(zsa zsa, List list) {
        x77 x77 = (x77) this.f.remove(zsa);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.i(((bta) it.next()).a);
        }
        this.i = false;
    }

    public final void f(long j) {
        bta bta = (bta) this.e.f(cta.MAIN_ACTIVITY_INIT_TO_RENDER);
        if (bta != null) {
            if (bta.e != -1) {
                bta = null;
            }
            if (bta != null) {
                bta.e = j - bta.b;
            }
        }
    }
}
