package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: vj9  reason: default package */
public final /* synthetic */ class vj9 implements qj3, grd {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj9 b;

    public /* synthetic */ vj9(zj9 zj9, int i) {
        this.a = i;
        this.b = zj9;
    }

    public void accept(Object obj) {
        mqb mqb;
        zj9 zj9 = this.b;
        switch (this.a) {
            case 0:
                zj9.getClass();
                hm9.r("zj9", (Throwable) obj, "startCrop error", new Object[0]);
                int i = jpc.E;
                ActLocalMedias actLocalMedias = (ActLocalMedias) zj9.c;
                actLocalMedias.getClass();
                Handler handler = a14.i;
                a14.N(0, actLocalMedias, actLocalMedias.getString(i));
                return;
            default:
                yj9 yj9 = (yj9) obj;
                zj9.getClass();
                hm9.k("zj9", "initVideoLocalMediasResult doOnSuccess");
                zj9.Z = yj9.c;
                long j = yj9.a;
                zj9.s0 = j;
                zj9.t0 = yj9.b;
                if (j == 0) {
                    hm9.k("zj9", "videoDuration == 0 -> hide controls");
                    zj9.d2(new mu1(11));
                } else if (yj9.d) {
                    hm9.k("zj9", "showQualityButton == true");
                    zj9.d2(new xj9(zj9, yj9, 0));
                } else {
                    hm9.k("zj9", "showQualityButton == false");
                    if (zj9.Z.isEmpty()) {
                        hm9.k("zj9", "allowedQualities is empty -> set default 480p");
                        mqb = mqb.P_480;
                    } else {
                        mqb = zj9.t0.a;
                    }
                    zj9.d2(new xj9(zj9, mqb, 1));
                }
                tj9 tj9 = zj9.c;
                if (tj9 != null) {
                    ((ActLocalMedias) tj9).p0(!zj9.t0.d, false);
                    return;
                }
                return;
        }
    }

    public void j(nqd nqd) {
        ref ref;
        ref ref2;
        zj9 zj9 = this.b;
        String a2 = zj9.X.a();
        ActLocalMedias actLocalMedias = (ActLocalMedias) zj9.c;
        actLocalMedias.getClass();
        em5 u = s36.u(actLocalMedias, Uri.parse(a2));
        Collections.emptyList();
        if (u.c != 0 && !nqd.h()) {
            i20 i20 = new i20(1);
            Object obj = null;
            i20.a = null;
            i20.b = 0.0f;
            i20.c = 1.0f;
            i20.d = false;
            ref ref3 = new ref(i20);
            r4d h = zj9.w0.h(zj9.X);
            if (!(h == null || (ref2 = h.b) == null)) {
                i20 i202 = new i20(1);
                i202.a = ref2.a;
                i202.b = ref2.b;
                i202.c = ref2.c;
                i202.d = ref2.d;
                ref3 = new ref(i202);
            }
            if (!nqd.h()) {
                ArrayList s = j1e.s(Uri.parse(zj9.X.a()), actLocalMedias, (cj0) ((y8a) ((ed3) actLocalMedias.K0.b)).getAccessor().c(cj0.class));
                if (s == null) {
                    s = new ArrayList();
                } else {
                    Collections.sort(s, nqb.g);
                }
                ArrayList arrayList = s;
                boolean z = arrayList.size() > 1;
                if (arrayList.size() > 0 && ref3.a == null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        obj = it.next();
                        if (it.hasNext()) {
                            mqb mqb = ((nqb) obj).a;
                            do {
                                Object next = it.next();
                                mqb mqb2 = ((nqb) next).a;
                                if (mqb.compareTo(mqb2) > 0) {
                                    obj = next;
                                    mqb = mqb2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    nqb nqb = (nqb) obj;
                    mqb mqb3 = zj9.Y.a;
                    if (nqb != null) {
                        mqb mqb4 = nqb.a;
                        if (mqb4.compareTo(mqb3) >= 0) {
                            mqb3 = mqb4;
                        }
                    }
                    i20 a3 = ref3.a();
                    a3.a = mqb3;
                    ref3 = new ref(a3);
                }
                if (!u.b) {
                    i20 a4 = ref3.a();
                    a4.d = true;
                    ref = new ref(a4);
                } else {
                    ref = ref3;
                }
                nqd.a(new yj9(u.c, ref, arrayList, z, u.b));
            }
        }
    }
}
