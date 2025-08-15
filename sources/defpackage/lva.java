package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: lva  reason: default package */
public final class lva implements ava {
    public final je7 a;
    public final je7 b;
    public final av0 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final o45 h;
    public volatile long i;
    public volatile boolean j;
    public final HashMap k = new HashMap();

    public lva(je7 je7, je7 je72, av0 av0, je7 je73, khe khe, je7 je74, je7 je75, o45 o45) {
        this.a = je7;
        this.b = je72;
        this.c = av0;
        this.d = je73;
        this.e = khe;
        this.f = je74;
        this.g = je75;
        this.h = o45;
        av0.d(this);
    }

    public final void a(ArrayList arrayList) {
        hm9.m("lva", "onPhonebookUpdated", new Object[0]);
        c();
    }

    public final void b(List list, Map map, Map map2) {
        int i2 = 3;
        hm9.m("lva", "onSyncSuccess: contacts=%s, phones=%s, requested=%s", Integer.valueOf(list.size()), Integer.valueOf(map.size()), Integer.valueOf(map2.size()));
        int size = list.size();
        je7 je7 = this.f;
        if (size > 0) {
            long t = ((p7b) ((m7b) this.d.getValue())).a.t();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wm3 wm3 = (wm3) it.next();
                if (wm3.a == t) {
                    list.remove(wm3);
                    break;
                }
            }
            ((k4a) ((pk) this.b.getValue())).u((List) list.stream().map(new gl3(2)).collect(Collectors.toList()));
            ((el3) je7.getValue()).u(list);
        }
        boolean z = false;
        for (String str : map.keySet()) {
            HashMap hashMap = this.k;
            Integer num = (Integer) hashMap.get(str);
            int intValue = num != null ? num.intValue() + 1 : 1;
            hashMap.put(str, Integer.valueOf(intValue));
            if (!z && intValue >= 10) {
                ((cba) this.h).c(new Exception("Contacts sync cycle"), true);
                z = true;
            }
        }
        je7 je72 = this.a;
        wlc wlc = ((k24) ((c34) je72.getValue())).e;
        ((OneMeRoomDatabase) wlc.a.m()).q(new flc(map, 3, wlc));
        for (String remove : map.keySet()) {
            map2.remove(remove);
        }
        hm9.m("lva", "markInvalidPhones: invalid phones: %s", Integer.valueOf(map2.size()));
        if (!map2.isEmpty()) {
            wlc wlc2 = ((k24) ((c34) je72.getValue())).e;
            Set<String> keySet = map2.keySet();
            ilc ilc = wlc2.c().a;
            ilc.b();
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE phones SET type = ? WHERE type = ? AND phone in (");
            a14.c(sb, keySet.size());
            sb.append(")");
            q36 d2 = ilc.d(sb.toString());
            d2.j(1, (long) 2);
            d2.j(2, (long) 0);
            for (String str2 : keySet) {
                if (str2 == null) {
                    d2.W(i2);
                } else {
                    d2.f(i2, str2);
                }
                i2++;
            }
            ilc.c();
            try {
                d2.n();
                ilc.r();
            } finally {
                ilc.l();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : map.entrySet()) {
            wlc wlc3 = ((k24) ((c34) je72.getValue())).e;
            Long l = (Long) value.getValue();
            l.longValue();
            wlc3.getClass();
            wua wua = (wua) x53.i0(wlc3.f(Collections.singletonList(l)));
            if (wua != null) {
                arrayList.add(wua);
            }
        }
        Set y = ((el3) je7.getValue()).y(arrayList);
        if (!y.isEmpty()) {
            ((ike) this.g.getValue()).f(y);
        }
        this.c.c(new pi0());
        ((ztc) this.e.getValue()).c(new kva(this, 0), 1, TimeUnit.SECONDS);
    }

    public final void c() {
        hm9.k("lva", "sync");
        if (this.j) {
            hm9.k("lva", "sync in progress, return");
            return;
        }
        this.j = true;
        ((ztc) this.e.getValue()).b(new kva(this, 1));
    }

    /* JADX INFO: finally extract failed */
    public final void d() {
        String str;
        Integer num;
        hm9.m("lva", "syncInternal", new Object[0]);
        hm9.m("lva", "select unsynced phones", new Object[0]);
        HashMap hashMap = new HashMap();
        rva c2 = ((k24) ((c34) this.a.getValue())).e.c();
        c2.getClass();
        xlc a2 = xlc.a(1, "SELECT * FROM phones WHERE type = ?");
        a2.j(1, (long) 0);
        ilc ilc = c2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "phonebook_id");
            int n3 = tfg.n(o, "contact_id");
            int n4 = tfg.n(o, "phone");
            int n5 = tfg.n(o, "server_phone");
            int n6 = tfg.n(o, "email");
            int n7 = tfg.n(o, "first_name");
            int n8 = tfg.n(o, "last_name");
            int n9 = tfg.n(o, "avatar_path");
            int n10 = tfg.n(o, "type");
            String str2 = "lva";
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(new xua(o.getLong(n), o.getLong(n2), o.getInt(n3), o.isNull(n4) ? null : o.getString(n4), o.getLong(n5), o.isNull(n6) ? null : o.getString(n6), o.isNull(n7) ? null : o.getString(n7), o.isNull(n8) ? null : o.getString(n8), o.isNull(n9) ? null : o.getString(n9), ey8.b(o.getInt(n10))));
            }
            o.close();
            a2.n();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(wlc.d((xua) it.next()));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                wua wua = (wua) it2.next();
                hashMap.put(wua.X, new pp3(wua.s0, wua.t0));
                if (hashMap.size() == 100) {
                    break;
                }
            }
            if (!hashMap.isEmpty()) {
                for (Map.Entry entry : this.k.entrySet()) {
                    if (!hashMap.containsKey(entry.getKey()) || (num = (Integer) entry.getValue()) == null || num.intValue() < 10) {
                        str = str2;
                    } else {
                        str = str2;
                        hm9.m(str, "syncInternal: already synced, skip", new Object[0]);
                        hashMap.remove(entry.getKey());
                    }
                    str2 = str;
                }
            }
            String str3 = str2;
            hm9.m(str3, "syncInternal: unsyncedPhones size=%s", Integer.valueOf(hashMap.size()));
            if (hashMap.size() == 0) {
                this.j = false;
                hm9.m(str3, "syncInternal: everything synced, return", new Object[0]);
                return;
            }
            k4a k4a = (k4a) ((pk) this.b.getValue());
            this.i = k4a.v(k4a, new oc2(((p7b) k4a.y()).a.o(), hashMap, 2));
        } catch (Throwable th) {
            o.close();
            a2.n();
            throw th;
        }
    }

    @uae
    public void onEvent(dhe dhe) {
        hm9.k("lva", "SyncResultEvent");
        ((ztc) this.e.getValue()).b(new do9(this, 11, dhe));
    }

    @uae
    public void onEvent(oi0 oi0) {
        if (oi0.a == this.i) {
            hm9.m("lva", "BaseErrorEvent :%s", oi0);
            this.j = false;
        }
    }
}
