package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: kr2  reason: default package */
public final class kr2 {
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;

    public kr2(rm4 rm4, rm4 rm42, rm4 rm43, rm4 rm44, rm4 rm45, rm4 rm46, rm4 rm47) {
        this.a = rm4;
        this.b = rm42;
        this.c = rm43;
        this.d = rm44;
        this.e = rm45;
        this.f = rm46;
        this.g = rm47;
    }

    public final CharSequence a(e52 e52) {
        k92 k92;
        f92 f92;
        String format;
        uj3 uj3;
        List list;
        if (e52.f0()) {
            return ((ida) this.b.get()).a.getString(jpc.O2);
        }
        ArrayList j = e52.j();
        if (!e52.M()) {
            if (e52.J()) {
                if (!j.isEmpty()) {
                    int c2 = e52.b.c();
                    if (!((ch3) this.a.get()).e() || !e52.e0() || e52.b.e.size() < e52.b.c()) {
                        format = are.s(fzb.tt_chat_subtitle_count, c2, ((ida) this.b.get()).a);
                    } else {
                        ArrayList j2 = e52.j();
                        u7b u7b = (u7b) this.c.get();
                        if (j2.isEmpty()) {
                            list = Collections.emptyList();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = j2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                try {
                                    if (u7b.e(((uj3) next).n())) {
                                        arrayList.add(next);
                                    }
                                } catch (Throwable th) {
                                    throw new RuntimeException(th);
                                }
                            }
                            list = arrayList;
                        }
                        int size = list.size();
                        ida ida = (ida) this.b.get();
                        ida.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(size + 1);
                        sb.append(" ");
                        int i = c2c.tt_of;
                        Context context = ida.a;
                        sb.append(context.getString(i));
                        sb.append(" ");
                        sb.append(c2);
                        sb.append(" ");
                        sb.append(context.getString(c2c.tt_contact_status_online));
                        format = sb.toString();
                    }
                } else if (e52.b.c() == 0) {
                    return "";
                } else {
                    if (e52.e0() && e52.b.c() == 1) {
                        return ((ida) this.b.get()).a.getString(c2c.tt_chat_participants_empty__subtitle);
                    }
                    return are.s(fzb.tt_chat_subtitle_count, e52.b.c(), ((ida) this.b.get()).a);
                }
            } else if (e52.I()) {
                ida ida2 = (ida) this.b.get();
                int c3 = e52.b.c();
                if (c3 == 0) {
                    ida2.getClass();
                    format = "";
                } else {
                    format = are.s(fzb.tt_channel_subtitle_count, c3, ida2.a);
                }
            } else if (e52.F()) {
                f92 f922 = e52.b.K;
                if (f922.g) {
                    synchronized (e52.Z) {
                        try {
                            uj3 = (!e52.F() || e52.Z.isEmpty()) ? null : (uj3) e52.Z.get(0);
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                            }
                        }
                    }
                    if (uj3 != null) {
                        return uj3.d();
                    }
                    return null;
                } else if (oag.t(f922.e)) {
                    return null;
                } else {
                    return String.format(((ida) this.b.get()).a.getString(c2c.tt_chat_admin_group_name_subtitle), new Object[]{e52.b.K.e});
                }
            } else if (!e52.Q() || (k92 = e52.b) == null || (f92 = k92.K) == null) {
                return null;
            } else {
                if (!f92.g) {
                    ida ida3 = (ida) this.b.get();
                    ida3.getClass();
                    boolean isEmpty = TextUtils.isEmpty((CharSequence) null);
                    Context context2 = ida3.a;
                    format = !isEmpty ? String.format(context2.getString(c2c.tt_chat_group_name_subtitle), new Object[]{null}) : context2.getString(c2c.tt_chat_group_subtitle);
                } else if (oag.t(f92.e)) {
                    return null;
                } else {
                    ida ida4 = (ida) this.b.get();
                    String str = e52.b.K.e;
                    ida4.getClass();
                    boolean isEmpty2 = TextUtils.isEmpty(str);
                    Context context3 = ida4.a;
                    format = !isEmpty2 ? String.format(context3.getString(c2c.tt_chat_group_name_subtitle), new Object[]{str}) : context3.getString(c2c.tt_chat_group_subtitle);
                }
            }
            return format;
        } else if (!j.isEmpty()) {
            return ((w7b) this.d.get()).b((uj3) j.get(0));
        } else {
            return null;
        }
    }
}
