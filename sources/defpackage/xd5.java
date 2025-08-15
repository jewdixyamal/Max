package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: xd5  reason: default package */
public final /* synthetic */ class xd5 implements fu3, qj3, u98, ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ xd5(w98 w98, Object obj, int i) {
        this.a = i;
        this.c = w98;
        this.o = obj;
        this.b = true;
    }

    public void accept(Object obj) {
        l20 k;
        long j;
        String str;
        int i;
        switch (this.a) {
            case 1:
                es8 es8 = (es8) obj;
                jg5 jg5 = (jg5) this.c;
                if (jg5.a() && ((FrgAttachVideo) jg5.d).o1 && jg5.c.g1() != null && (k = es8.a.z0.k(g20.u0)) != null) {
                    if (((String) this.o).equals(k.r)) {
                        jg5.b(es8, k, jg5.c, this.b, jg5.m, jg5.l);
                        return;
                    }
                    return;
                }
                return;
            default:
                yqe yqe = (yqe) obj;
                hda hda = (hda) this.c;
                List list = null;
                for (uj3 uj3 : ((ds3) hda.e.getValue()).a.b.values()) {
                    if (TextUtils.equals(yqe.c, uj3.j())) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(uj3);
                    }
                }
                if (list == null) {
                    list = Collections.emptyList();
                }
                int size = list.size();
                LinkedHashSet<nu8> linkedHashSet = (LinkedHashSet) this.o;
                boolean z = false;
                if (size == 1) {
                    j = ((uj3) list.get(0)).n();
                    str = null;
                } else {
                    if (!this.b) {
                        str = yqe.c;
                        if (str.length() > 1) {
                            if (linkedHashSet.isEmpty()) {
                                i = 0;
                            } else {
                                i = 0;
                                for (nu8 nu8 : linkedHashSet) {
                                    String str2 = nu8.b;
                                    if ((!(str2 == null || str2.length() == 0)) && (i = i + 1) < 0) {
                                        y53.Q();
                                        throw null;
                                    }
                                }
                            }
                            qyc qyc = (qyc) ((y7d) hda.f.getValue());
                            qyc.getClass();
                            if (i < ((int) qyc.q(PmsKey.mentions_entity_names_limit, (long) 3))) {
                                if (str.charAt(0) == '@') {
                                    str = str.substring(1);
                                }
                                j = 0;
                            } else {
                                return;
                            }
                        }
                    }
                    str = null;
                    j = 0;
                }
                if (j != 0 || (str != null && str.length() != 0)) {
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    String str3 = z ^ true ? str : null;
                    mu8 mu8 = mu8.a;
                    int i2 = yqe.b;
                    int i3 = yqe.a;
                    linkedHashSet.add(new nu8(j, str3, mu8, i3, i2 - i3, (Map) null));
                    return;
                }
                return;
        }
    }

    public void b(oh8 oh8) {
        si8 si8 = (si8) this.c;
        si8.getClass();
        ccd q = si8.f.q(oh8, zw6.n((tb8) this.o), -1, -9223372036854775807L);
        td tdVar = new td((Object) si8, (Object) oh8, this.b, 13);
        q.d(new h76(q, 0, tdVar), nk4.a);
    }

    public void c(qr6 qr6, int i) {
        switch (this.a) {
            case 2:
                w98 w98 = (w98) this.c;
                w98.getClass();
                qr6.d(w98.c, i, ((h30) this.o).c(), this.b);
                return;
            case 3:
                w98 w982 = (w98) this.c;
                w982.getClass();
                ww6 i2 = zw6.i();
                int i3 = 0;
                while (true) {
                    List list = (List) this.o;
                    if (i3 < list.size()) {
                        i2.a(((tb8) list.get(i3)).d(true));
                        i3++;
                    } else {
                        qr6.J(w982.c, i, new pu0(i2.j()), this.b);
                        return;
                    }
                }
            default:
                w98 w983 = (w98) this.c;
                w983.getClass();
                qr6.l0(w983.c, i, ((tb8) this.o).d(true), this.b);
                return;
        }
    }

    public Object u(Task task) {
        if (((Integer) task.f()).intValue() != 402) {
            return task;
        }
        boolean z = this.b;
        return imc.F((Context) this.c, (Intent) this.o, z).j(new cs(2), new nc5(25));
    }

    public /* synthetic */ xd5(hda hda, boolean z, LinkedHashSet linkedHashSet) {
        this.a = 6;
        this.c = hda;
        this.b = z;
        this.o = linkedHashSet;
    }

    public /* synthetic */ xd5(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
    }
}
