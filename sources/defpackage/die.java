package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: die  reason: default package */
public final class die implements s24, hk8, mr4, o55, i7, Provider {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ die(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static void L(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static void k(bg1 bg1, fg1 fg1, HashMap hashMap) {
        hashMap.put("participant_id", bg1.c());
        if (fg1 != null) {
            if (fg1.b()) {
                kpa kpa = fg1.j;
                hashMap.put("participant_accept_peer_id", kpa.a);
                hashMap.put("participant_accept_peer_type", kpa.b);
            }
            hashMap.put("participant_connected", Boolean.toString(fg1.g));
            hi9 hi9 = fg1.b;
            int ordinal = hi9.a.ordinal();
            if (ordinal == 0) {
                hashMap.put("participant_audio_option_state", "UNMUTE");
            } else if (ordinal == 1) {
                hashMap.put("participant_audio_option_state", "MUTE");
            } else if (ordinal == 2 || ordinal == 3) {
                hashMap.put("participant_audio_option_state", "MUTE_PERMANENT");
            }
            int ordinal2 = hi9.b.ordinal();
            if (ordinal2 == 0) {
                hashMap.put("participant_video_option_state", "UNMUTE");
            } else if (ordinal2 == 1) {
                hashMap.put("participant_video_option_state", "MUTE");
            } else if (ordinal2 == 2 || ordinal2 == 3) {
                hashMap.put("participant_video_option_state", "MUTE_PERMANENT");
            }
            int ordinal3 = hi9.c.ordinal();
            if (ordinal3 == 0) {
                hashMap.put("participant_screenshare_option_state", "UNMUTE");
            } else if (ordinal3 == 1) {
                hashMap.put("participant_screenshare_option_state", "MUTE");
            } else if (ordinal3 == 2 || ordinal3 == 3) {
                hashMap.put("participant_screenshare_option_state", "MUTE_PERMANENT");
            }
            ji9 ji9 = fg1.c;
            hashMap.put("participant_audio_enabled", String.valueOf(ji9.e));
            hashMap.put("participant_video_enabled", String.valueOf(ji9.f));
            hashMap.put("participant_screen_cast_enabled", String.valueOf(ji9.b));
        }
    }

    public void A(cie cie) {
        ilc ilc = (ilc) this.a;
        ilc.b();
        ilc.c();
        try {
            ((sh) this.b).C(cie);
            ilc.r();
        } finally {
            ilc.l();
        }
    }

    public void B(int i, xj8 xj8) {
        if (C(i, xj8)) {
            ((kr4) this.c).f();
        }
    }

    public boolean C(int i, xj8 xj8) {
        xj8 xj82;
        oc3 oc3 = (oc3) this.o;
        if (xj8 != null) {
            xj82 = oc3.p(this.a, xj8);
            if (xj82 == null) {
                return false;
            }
        } else {
            xj82 = null;
        }
        oc3.getClass();
        gk8 gk8 = (gk8) this.b;
        if (gk8.b != i || !maf.a((xj8) gk8.c, xj82)) {
            this.b = new gk8((CopyOnWriteArrayList) oc3.c.d, i, xj82, 0);
        }
        kr4 kr4 = (kr4) this.c;
        if (kr4.a == i && maf.a(kr4.b, xj82)) {
            return true;
        }
        this.c = new kr4(oc3.d.c, i, xj82);
        return true;
    }

    public pc8 D(pc8 pc8) {
        ((oc3) this.o).getClass();
        long j = pc8.e;
        long j2 = pc8.e;
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        long j3 = pc8.f;
        if (i == 0 && j3 == j3) {
            return pc8;
        }
        return new pc8(pc8.a, pc8.b, (oy5) pc8.g, pc8.c, pc8.d, j2, j3);
    }

    public void E(int i, xj8 xj8, pc8 pc8) {
        if (C(i, xj8)) {
            ((gk8) this.b).c(D(pc8));
        }
    }

    public void F(int i, xj8 xj8, pc8 pc8) {
        if (C(i, xj8)) {
            ((gk8) this.b).m(D(pc8));
        }
    }

    public boolean G(j7 j7Var, Menu menu) {
        qde s = s(j7Var);
        qpd qpd = (qpd) this.o;
        Menu menu2 = (Menu) qpd.get(menu);
        if (menu2 == null) {
            menu2 = new rr8((Context) this.b, (wq8) menu);
            qpd.put(menu, menu2);
        }
        return ((ActionMode.Callback) this.a).onPrepareActionMode(s, menu2);
    }

    public eqa H(JSONArray jSONArray, zad zad) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("state");
            bg1 F = f46.F(jSONObject);
            fg1 fg1 = (fg1) this.a;
            if (F.equals(fg1.a)) {
                fg1.q = ((hd9) this.c).h(jSONObject, zad);
                ArrayList y = f46.y(jSONObject);
                ArrayList arrayList3 = fg1.d;
                arrayList3.clear();
                arrayList3.addAll(y);
                kd1 kd1 = (kd1) this.b;
                kd1.n(jSONObject, "handleConversationParticipants", kd1.g(zad, 2), true, zad, zad);
            } else if ("ACCEPTED".equals(string)) {
                arrayList.add(p(F, jSONObject, zad));
            } else if ("CALLED".equals(string)) {
                arrayList.add(q(F, jSONObject, zad));
            } else {
                hashSet.add(F);
            }
            dg1 n = ((ey1) this.o).n(jSONObject);
            if (n != null) {
                arrayList2.add(n);
            }
        }
        return new eqa(arrayList, arrayList2);
    }

    public void I(int i, xj8 xj8) {
        if (C(i, xj8)) {
            ((kr4) this.c).c();
        }
    }

    public void J(int i, yqc yqc) {
        SparseArray sparseArray = (SparseArray) this.b;
        fm9.j("Exactly one SampleExporter can be added for each track type.", !oaf.l(sparseArray, i));
        sparseArray.put(i, yqc);
    }

    public void K(int i, xj8 xj8) {
        if (C(i, xj8)) {
            ((kr4) this.c).b();
        }
    }

    public void M(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        if (C(i, xj8)) {
            ((gk8) this.b).g(xn7, D(pc8));
        }
    }

    public void N(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        if (C(i, xj8)) {
            ((gk8) this.b).l(xn7, D(pc8));
        }
    }

    public mk0 O(List list) {
        ArrayList n = n(list);
        if (n.size() < 2) {
            return (mk0) mqd.l(n, (Object) null);
        }
        Collections.sort(n, new v00(4));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((mk0) n.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= n.size()) {
                break;
            }
            mk0 mk0 = (mk0) n.get(i3);
            if (i2 == mk0.c) {
                arrayList.add(new Pair(mk0.b, Integer.valueOf(mk0.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (mk0) n.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.c;
        mk0 mk02 = (mk0) hashMap.get(arrayList);
        if (mk02 == null) {
            List subList = n.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((mk0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.o).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= subList.size()) {
                    mk02 = (mk0) mqd.m(subList);
                    break;
                }
                mk0 mk03 = (mk0) subList.get(i);
                i6 += mk03.d;
                if (nextInt < i6) {
                    mk02 = mk03;
                    break;
                }
                i++;
            }
            hashMap.put(arrayList, mk02);
        }
        return mk02;
    }

    public boolean P(int i) {
        return ((i1f) ((ArrayList) this.a).get(i)).a.size() > 1;
    }

    public void Q(Uri uri) {
        this.o = null;
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            this.o = arrayList;
            arrayList.add(uri);
        }
    }

    public void R(CharSequence charSequence) {
        ((Intent) this.b).putExtra("android.intent.extra.TEXT", charSequence);
    }

    public void S() {
        ((Context) this.a).startActivity(Intent.createChooser(w(), (CharSequence) this.c));
    }

    public void T(qj3 qj3, qj3 qj32) {
        sd7 sd7 = (sd7) this.o;
        if (sd7 == null || sd7.h()) {
            qy9 d = ((lz) ((List) this.b).get(0)).d();
            hle hle = (hle) ((rm4) this.a).get();
            hle.getClass();
            s1a r = d.r(((jle) hle).a());
            sd7 sd72 = new sd7(qj3, qj32, ft.d);
            r.a(sd72);
            this.o = sd72;
        }
    }

    public ExecutorService a() {
        return (ExecutorService) ((khe) this.c).getValue();
    }

    public void b(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        if (C(i, xj8)) {
            ((gk8) this.b).e(xn7, D(pc8));
        }
    }

    public ExecutorService c() {
        return ((iba) ((je7) this.a).getValue()).d();
    }

    public ExecutorService d() {
        return (ExecutorService) ((khe) this.o).getValue();
    }

    public ExecutorService e() {
        return (ExecutorService) ((khe) this.b).getValue();
    }

    public List f(long j, vk6 vk6, int i, int i2, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        au8 au8 = (au8) this.b;
        ge2 ge2 = (ge2) this.a;
        e52 e52 = (e52) this.c;
        if (i > 0) {
            long j4 = e52.a;
            ge2.getClass();
            ArrayList l = ((k24) au8.a).c.l(j4, j, (Set) this.o, Integer.valueOf(i), true);
            arrayList.addAll(!l.isEmpty() ? ge2.f.b(l) : Collections.emptyList());
        }
        if (i2 > 0) {
            long j5 = e52.a;
            ge2.getClass();
            ArrayList l2 = ((k24) au8.a).c.l(j5, j, (Set) this.o, Integer.valueOf(i2), false);
            arrayList.addAll(!l2.isEmpty() ? ge2.f.b(l2) : Collections.emptyList());
        }
        return new ArrayList(arrayList);
    }

    public void g(int i, xj8 xj8, Exception exc) {
        if (C(i, xj8)) {
            ((kr4) this.c).e(exc);
        }
    }

    public Object get() {
        return new o7g((Executor) ((Provider) this.a).get(), (h45) ((Provider) this.b).get(), (z77) ((Provider) this.c).get(), (fhe) ((Provider) this.o).get());
    }

    public ExecutorService h() {
        return (ExecutorService) ((khe) this.b).getValue();
    }

    public boolean i(j7 j7Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(s(j7Var), new fr8((Context) this.b, (vde) menuItem));
    }

    public ExecutorService j() {
        return (ExecutorService) ((khe) this.b).getValue();
    }

    public void l(j7 j7Var) {
        ((ActionMode.Callback) this.a).onDestroyActionMode(s(j7Var));
    }

    public void m(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fp1 fp1 = ((u41) it.next()).a;
            if (fp1.a == olf.b) {
                linkedHashSet.add(fp1.b);
            }
        }
        Iterator it2 = ((LinkedHashMap) this.c).entrySet().iterator();
        while (it2.hasNext()) {
            bg1 bg1 = (bg1) ((Map.Entry) it2.next()).getKey();
            if (!linkedHashSet.contains(bg1)) {
                ((LinkedHashSet) this.o).add(bg1);
                it2.remove();
            }
        }
    }

    public ArrayList n(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        L(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        L(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            mk0 mk0 = (mk0) list.get(i);
            if (!hashMap.containsKey(mk0.b) && !hashMap2.containsKey(Integer.valueOf(mk0.c))) {
                arrayList.add(mk0);
            }
        }
        return arrayList;
    }

    public boolean o(j7 j7Var, wq8 wq8) {
        qde s = s(j7Var);
        qpd qpd = (qpd) this.o;
        Menu menu = (Menu) qpd.get(wq8);
        if (menu == null) {
            menu = new rr8((Context) this.b, wq8);
            qpd.put(wq8, menu);
        }
        return ((ActionMode.Callback) this.a).onCreateActionMode(s, menu);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: wmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: wmc} */
    /* JADX WARNING: type inference failed for: r13v0, types: [rpa] */
    /* JADX WARNING: type inference failed for: r15v0, types: [rpa] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.dqa p(defpackage.bg1 r18, org.json.JSONObject r19, defpackage.zad r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            java.lang.Object r2 = r0.b
            r3 = r2
            kd1 r3 = (defpackage.kd1) r3
            hi9 r2 = r3.h(r1)
            java.util.EnumMap r7 = r2.a()
            java.lang.String r6 = "createAddOrUpdateParamsForAcceptedParticipant"
            r8 = 1
            r4 = r19
            r5 = r18
            hi9 r2 = r3.f(r4, r5, r6, r7, r8)
            ji9 r3 = defpackage.f46.o(r19)
            java.util.ArrayList r4 = defpackage.f46.y(r19)
            kpa r5 = defpackage.f46.q(r19)
            if (r5 != 0) goto L_0x002c
            kpa r5 = defpackage.fg1.r
        L_0x002c:
            o61 r6 = defpackage.f46.k(r19)
            pq9 r7 = new pq9
            r7.<init>()
            pq9 r8 = new pq9
            r8.<init>()
            wmc r11 = new wmc
            r9 = 0
            r11.<init>(r5, r9)
            wmc r12 = new wmc
            r5 = 0
            r12.<init>(r2, r5)
            if (r3 == 0) goto L_0x004e
            wmc r7 = new wmc
            r2 = 0
            r7.<init>(r3, r2)
        L_0x004e:
            r13 = r7
            wmc r14 = new wmc
            r2 = 0
            r14.<init>(r4, r2)
            if (r6 == 0) goto L_0x005d
            wmc r8 = new wmc
            r2 = 0
            r8.<init>(r6, r2)
        L_0x005d:
            r15 = r8
            java.lang.Object r0 = r0.c
            hd9 r0 = (defpackage.hd9) r0
            r2 = r19
            java.util.List r0 = r0.h(r2, r1)
            wmc r1 = new wmc
            r2 = 0
            r1.<init>(r0, r2)
            dqa r0 = new dqa
            r9 = r0
            r10 = r18
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.die.p(bg1, org.json.JSONObject, zad):dqa");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: wmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: wmc} */
    /* JADX WARNING: type inference failed for: r6v1, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [rpa] */
    /* JADX WARNING: type inference failed for: r10v0, types: [rpa] */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.dqa q(defpackage.bg1 r13, org.json.JSONObject r14, defpackage.zad r15) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.b
            r1 = r0
            kd1 r1 = (defpackage.kd1) r1
            hi9 r0 = r1.h(r15)
            java.util.EnumMap r5 = r0.a()
            java.lang.String r4 = "createAddOrUpdateParamsForCalledParticipant"
            r6 = 1
            r2 = r14
            r3 = r13
            hi9 r0 = r1.f(r2, r3, r4, r5, r6)
            ji9 r1 = defpackage.f46.o(r14)
            java.util.ArrayList r2 = defpackage.f46.y(r14)
            o61 r3 = defpackage.f46.k(r14)
            pq9 r6 = new pq9
            r6.<init>()
            pq9 r4 = new pq9
            r4.<init>()
            pq9 r5 = new pq9
            r5.<init>()
            wmc r7 = new wmc
            r8 = 0
            r7.<init>(r0, r8)
            if (r1 == 0) goto L_0x0041
            wmc r0 = new wmc
            r4 = 0
            r0.<init>(r1, r4)
            r8 = r0
            goto L_0x0042
        L_0x0041:
            r8 = r4
        L_0x0042:
            wmc r9 = new wmc
            r0 = 0
            r9.<init>(r2, r0)
            if (r3 == 0) goto L_0x0052
            wmc r0 = new wmc
            r1 = 0
            r0.<init>(r3, r1)
            r10 = r0
            goto L_0x0053
        L_0x0052:
            r10 = r5
        L_0x0053:
            java.lang.Object r12 = r12.c
            hd9 r12 = (defpackage.hd9) r12
            java.util.List r12 = r12.h(r14, r15)
            wmc r11 = new wmc
            r14 = 0
            r11.<init>(r12, r14)
            dqa r12 = new dqa
            r4 = r12
            r5 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.die.q(bg1, org.json.JSONObject, zad):dqa");
    }

    public void r(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((qpd) this.b).get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        r(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public qde s(j7 j7Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qde qde = (qde) arrayList.get(i);
            if (qde != null && qde.b == j7Var) {
                return qde;
            }
        }
        qde qde2 = new qde((Context) this.b, j7Var);
        arrayList.add(qde2);
        return qde2;
    }

    public o43 t() {
        o43 o43;
        ww0 ww0;
        iy3 iy3;
        boolean z;
        do {
            synchronized (this) {
                Iterator it = ((LinkedHashSet) this.o).iterator();
                o43 = null;
                if (it.hasNext()) {
                    ww0 = (ww0) it.next();
                    it.remove();
                } else {
                    ww0 = null;
                }
            }
            if (ww0 == null) {
                return null;
            }
            nw7 nw7 = (nw7) ((jy3) this.b);
            nw7.getClass();
            synchronized (nw7) {
                try {
                    iy3 = (iy3) nw7.b.M(ww0);
                    z = false;
                    if (iy3 != null) {
                        iy3 iy32 = (iy3) nw7.c.M(ww0);
                        iy32.getClass();
                        if (iy32.c == 0) {
                            z = true;
                        }
                        od2.p(z);
                        o43 = iy32.b;
                        z = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z) {
                nw7.d(iy3);
                continue;
            }
        } while (o43 == null);
        return o43;
    }

    public void u(int i, xj8 xj8, xn7 xn7, pc8 pc8, IOException iOException, boolean z) {
        if (C(i, xj8)) {
            ((gk8) this.b).j(xn7, D(pc8), iOException, z);
        }
    }

    public void v(int i, xj8 xj8) {
        if (C(i, xj8)) {
            ((kr4) this.c).a();
        }
    }

    public Intent w() {
        ArrayList arrayList = (ArrayList) this.o;
        Intent intent = (Intent) this.b;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = (ArrayList) this.o;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData((ClipData) null);
                intent.setFlags(intent.getFlags() & -2);
            } else {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) this.o).get(0));
                ju0.E(intent, (ArrayList) this.o);
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) this.o);
            ju0.E(intent, (ArrayList) this.o);
        }
        return intent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: cie} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.cie x(defpackage.l7g r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            xlc r0 = defpackage.xlc.a(r1, r0)
            java.lang.String r2 = r6.a
            r3 = 1
            if (r2 != 0) goto L_0x0010
            r0.W(r3)
            goto L_0x0013
        L_0x0010:
            r0.f(r3, r2)
        L_0x0013:
            int r6 = r6.b
            long r2 = (long) r6
            r0.j(r1, r2)
            java.lang.Object r5 = r5.a
            ilc r5 = (defpackage.ilc) r5
            r5.b()
            r6 = 0
            android.database.Cursor r5 = r5.o(r0, r6)
            java.lang.String r1 = "work_spec_id"
            int r1 = defpackage.tfg.n(r5, r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "generation"
            int r2 = defpackage.tfg.n(r5, r2)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "system_id"
            int r3 = defpackage.tfg.n(r5, r3)     // Catch:{ all -> 0x0057 }
            boolean r4 = r5.moveToFirst()     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0059
            boolean r4 = r5.isNull(r1)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            java.lang.String r6 = r5.getString(r1)     // Catch:{ all -> 0x0057 }
        L_0x0048:
            int r1 = r5.getInt(r2)     // Catch:{ all -> 0x0057 }
            int r2 = r5.getInt(r3)     // Catch:{ all -> 0x0057 }
            cie r3 = new cie     // Catch:{ all -> 0x0057 }
            r3.<init>(r6, r1, r2)     // Catch:{ all -> 0x0057 }
            r6 = r3
            goto L_0x0059
        L_0x0057:
            r6 = move-exception
            goto L_0x0060
        L_0x0059:
            r5.close()
            r0.n()
            return r6
        L_0x0060:
            r5.close()
            r0.n()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.die.x(l7g):cie");
    }

    public void y(int i, xj8 xj8, int i2) {
        if (C(i, xj8)) {
            ((kr4) this.c).d(i2);
        }
    }

    public boolean z() {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.a;
            if (i >= arrayList.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    i1f i1f = (i1f) arrayList.get(i2);
                    if (i1f.b != i1f.a.size()) {
                        return false;
                    }
                }
                return true;
            } else if (((i1f) arrayList.get(i)).b == -1) {
                return false;
            } else {
                i++;
            }
        }
    }

    public die(int i) {
        switch (i) {
            case 7:
                this.a = new u5b(10);
                this.b = new qpd(0);
                this.c = new ArrayList();
                this.o = new HashSet();
                return;
            default:
                Random random = new Random();
                this.c = new HashMap();
                this.o = random;
                this.a = new HashMap();
                this.b = new HashMap();
                return;
        }
    }

    public die(Context context, int i) {
        Activity activity;
        switch (i) {
            case 13:
                context.getClass();
                this.a = context;
                Intent action = new Intent().setAction("android.intent.action.SEND");
                this.b = action;
                action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
                action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
                action.addFlags(524288);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    ComponentName componentName = activity.getComponentName();
                    ((Intent) this.b).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                    ((Intent) this.b).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
                    return;
                }
                return;
            default:
                this.c = new AtomicReference((Object) null);
                this.o = new Handler();
                this.b = context;
                return;
        }
    }

    public die(cg cgVar, jy3 jy3) {
        this.a = cgVar;
        this.b = jy3;
        this.o = new LinkedHashSet();
        this.c = new w4d(2, (Object) this);
    }

    public die(rm4 rm4, ArrayList arrayList, ArrayList arrayList2) {
        this.a = rm4;
        this.b = arrayList;
        this.c = arrayList2;
    }
}
