package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.fragment.app.b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bwf  reason: default package */
public final class bwf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public bwf(a4c a4c, lz1 lz1, qz7 qz7, aab aab, ph4 ph4, l7b l7b) {
        this.a = a4c;
        this.b = lz1;
        this.c = qz7;
        this.d = aab;
        this.e = ph4;
        this.f = l7b;
    }

    public static dbd b(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1881281404) {
            if (hashCode != -1785516855) {
                if (hashCode != -873347853) {
                    if (hashCode == -595928767 && str.equals("TIMEOUT")) {
                        return dbd.o;
                    }
                } else if (str.equals("ACTIVATE")) {
                    return dbd.c;
                }
            } else if (str.equals("UPDATE")) {
                return dbd.a;
            }
        } else if (str.equals("REMOVE")) {
            return dbd.b;
        }
        return null;
    }

    public static b94 c(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = oaf.f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
                i++;
            } else {
                throw new IOException(zr6.h(readInt2, "Invalid value size: "));
            }
        }
        return new b94(hashMap);
    }

    public static void d(b94 b94, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = b94.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public cbd a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("events");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            dbd b2 = b(jSONArray.getString(i));
            if (b2 != null) {
                linkedHashSet.add(b2);
            }
        }
        int i2 = jSONObject.getInt("roomId");
        boolean optBoolean = jSONObject.optBoolean("deactivate");
        JSONObject optJSONObject = jSONObject.optJSONObject("room");
        return new cbd(linkedHashSet, i2, optJSONObject != null ? l(optJSONObject) : null, optBoolean);
    }

    public void e(a8g a8g, String str, String str2) {
        String string = ((b) this.a).getString(jpc.r);
        if (!(true ^ (str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean m = f8.m(15);
            if (TextUtils.isEmpty(string) && !m) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            } else if (TextUtils.isEmpty(string) || !m) {
                ay ayVar = new ay((CharSequence) str, str2, string);
                je7 je7 = (je7) this.f;
                if (a8g == null) {
                    ((dn0) je7.getValue()).a(ayVar, (a8g) null);
                    return;
                }
                dn0 dn0 = (dn0) je7.getValue();
                dn0.getClass();
                if (true & true) {
                    throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
                } else if (Build.VERSION.SDK_INT >= 30 || !f8.m(15)) {
                    dn0.a(ayVar, a8g);
                } else {
                    throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                }
            } else {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
        } else {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
    }

    public hh2 f(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("updates");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            dbd b2 = b(next);
            if (b2 != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                if (jSONObject3.has("rooms")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("rooms");
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(l(jSONArray.getJSONObject(i)));
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        hpd hpd = (hpd) it.next();
                        arrayList.add(new cbd(Collections.singleton(b2), hpd.a, hpd, false));
                    }
                } else {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roomIds");
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList3.add(Integer.valueOf(jSONArray2.getInt(i2)));
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new cbd(Collections.singleton(b2), ((Number) it2.next()).intValue(), (hpd) null, false));
                    }
                }
            }
        }
        return new hh2(arrayList);
    }

    public ukg g(ukg ukg) {
        return ukg.j(new cs(2), new z16(6, this));
    }

    public mx0 h(String str) {
        return (mx0) ((HashMap) this.a).get(str);
    }

    public mx0 i(String str) {
        HashMap hashMap = (HashMap) this.a;
        mx0 mx0 = (mx0) hashMap.get(str);
        if (mx0 != null) {
            return mx0;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        mx0 mx02 = new mx0(keyAt, str, b94.c);
        hashMap.put(str, mx02);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.d).put(keyAt, true);
        ((ox0) this.e).e(mx02);
        return mx02;
    }

    public void j(long j) {
        ox0 ox0;
        ox0 ox02 = (ox0) this.e;
        ox02.i(j);
        ox0 ox03 = (ox0) this.f;
        if (ox03 != null) {
            ox03.i(j);
        }
        boolean f2 = ox02.f();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        if (f2 || (ox0 = (ox0) this.f) == null || !ox0.f()) {
            ox02.k(hashMap, sparseArray);
        } else {
            ((ox0) this.f).k(hashMap, sparseArray);
            ox02.a(hashMap);
        }
        ox0 ox04 = (ox0) this.f;
        if (ox04 != null) {
            ox04.l();
            this.f = null;
        }
    }

    public void k(String str) {
        HashMap hashMap = (HashMap) this.a;
        mx0 mx0 = (mx0) hashMap.get(str);
        if (mx0 != null && mx0.c.isEmpty() && mx0.d.isEmpty()) {
            hashMap.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
            int i = mx0.a;
            boolean z = sparseBooleanArray.get(i);
            ((ox0) this.e).c(mx0, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
                return;
            }
            sparseArray.put(i, (Object) null);
            ((SparseBooleanArray) this.c).put(i, true);
        }
    }

    public hpd l(JSONObject jSONObject) {
        gpd gpd;
        o01 o01;
        jpd jpd;
        jpd jpd2;
        gpd gpd2;
        JSONObject jSONObject2 = jSONObject;
        int i = jSONObject2.getInt("id");
        String string = jSONObject2.getString("name");
        Boolean valueOf = jSONObject2.has("active") ? Boolean.valueOf(jSONObject2.optBoolean("active")) : null;
        if (jSONObject2.has("countdownSec")) {
            jSONObject2.optInt("countdownSec");
        }
        Long valueOf2 = jSONObject2.has("timeoutMs") ? Long.valueOf(jSONObject2.optLong("timeoutMs")) : null;
        int optInt = jSONObject2.optInt("participantCount");
        JSONArray optJSONArray = jSONObject2.optJSONArray("participantIds");
        lz1 lz1 = (lz1) this.b;
        ArrayList a2 = optJSONArray != null ? lz1.a(optJSONArray) : null;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("addParticipantIds");
        ArrayList a3 = optJSONArray2 != null ? lz1.a(optJSONArray2) : null;
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("removeParticipantIds");
        ArrayList a4 = optJSONArray3 != null ? lz1.a(optJSONArray3) : null;
        JSONObject optJSONObject = jSONObject2.optJSONObject("recordInfo");
        if (optJSONObject != null) {
            aab aab = (aab) this.d;
            aab.getClass();
            try {
                gpd2 = aab.f(optJSONObject);
            } catch (JSONException e2) {
                ((a4c) aab.a).logException("RecordInfoParser", "Can't parse record info", e2);
                gpd2 = null;
            }
            gpd = gpd2;
        } else {
            gpd = null;
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("asrInfo");
        if (optJSONObject2 != null) {
            ((ph4) this.e).getClass();
            o01 = ph4.s(optJSONObject2);
        } else {
            o01 = null;
        }
        Map n = jSONObject2.has("muteStates") ? f46.n(jSONObject) : oz4.a;
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("participants");
        fpd S = optJSONObject3 != null ? ((qz7) this.c).S(optJSONObject3, new yad(i)) : null;
        boolean isNull = jSONObject2.isNull("pinnedParticipantId");
        String t = f8.t(jSONObject2, "pinnedParticipantId");
        bg1 a5 = (isNull || t == null) ? null : bg1.a(t);
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("urlSharingInfo");
        if (optJSONObject4 != null) {
            l7b l7b = (l7b) this.f;
            l7b.getClass();
            try {
                jpd2 = new jpd(bg1.a(optJSONObject4.getString("initiatorId")), optJSONObject4.getString("sharedUrl"));
            } catch (JSONException e3) {
                ((a4c) l7b.b).logException("UrlSharingParser", "Can't parse url sharing", e3);
                jpd2 = null;
            }
            jpd = jpd2;
        } else {
            jpd = null;
        }
        return new hpd(i, string, valueOf, a2, a3, a4, valueOf2, Integer.valueOf(optInt), gpd, o01, n, S, a5, jpd);
    }

    public void m(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String str4;
        boolean g;
        int i2;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        fl5 fl5 = (fl5) this.a;
        fl5.a();
        bundle.putString("gmp_app_id", fl5.c.b);
        jjf jjf = (jjf) this.b;
        synchronized (jjf) {
            try {
                if (jjf.a == 0) {
                    packageInfo = ((Context) jjf.c).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    if (packageInfo != null) {
                        jjf.a = packageInfo.versionCode;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.toString();
                packageInfo = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
            i = jjf.a;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((jjf) this.b).g());
        jjf jjf2 = (jjf) this.b;
        synchronized (jjf2) {
            try {
                if (((String) jjf2.e) == null) {
                    jjf2.j();
                }
                str3 = (String) jjf2.e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        bundle.putString("app_ver_name", str3);
        fl5 fl52 = (fl5) this.a;
        fl52.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(fl52.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((ua0) j1e.b(((il5) ((jl5) this.f)).d())).a;
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) j1e.b(((il5) ((jl5) this.f)).c()));
        bundle.putString("cliv", "fcm-24.0.1");
        mj6 mj6 = (mj6) ((gpb) this.e).get();
        ef4 ef4 = (ef4) ((gpb) this.d).get();
        if (mj6 != null && ef4 != null) {
            bb4 bb4 = (bb4) mj6;
            synchronized (bb4) {
                long currentTimeMillis = System.currentTimeMillis();
                nj6 nj6 = (nj6) bb4.a.get();
                synchronized (nj6) {
                    g = nj6.g(currentTimeMillis);
                }
                if (g) {
                    synchronized (nj6) {
                        String d2 = nj6.d(System.currentTimeMillis());
                        nj6.a.edit().putString("last-used-date", d2).commit();
                        nj6.f(d2);
                    }
                    i2 = 3;
                } else {
                    i2 = 1;
                }
            }
            if (i2 != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(au1.s(i2)));
                bundle.putString("Firebase-Client", ef4.a());
            }
        }
    }

    public ukg n(String str, String str2, Bundle bundle) {
        int i;
        try {
            m(str, str2, bundle);
            goc goc = (goc) this.c;
            l2a l2a = goc.c;
            int g = l2a.g();
            ok4 ok4 = ok4.o;
            if (g < 12000000) {
                return l2a.h() != 0 ? goc.a(bundle).k(ok4, new aab(goc, bundle)) : j1e.q(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            pkg f2 = pkg.f(goc.b);
            synchronized (f2) {
                i = f2.b;
                f2.b = i + 1;
            }
            return f2.h(new ckg(i, 1, bundle, 1)).j(ok4, dp3.Y);
        } catch (InterruptedException | ExecutionException e2) {
            return j1e.q(e2);
        }
    }

    public void o() {
        ((ox0) this.e).h((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public bwf(im imVar, k56 k56, k56 k562) {
        this.a = imVar;
        this.b = k56;
        this.c = k562;
        this.d = bwf.class.getName();
        this.e = tu0.r(3, new zvf(this, 0));
        this.f = tu0.r(3, new zvf(this, 1));
    }

    public bwf(e34 e34, File file, boolean z) {
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        m5d m5d = e34 != null ? new m5d(e34) : null;
        nx0 nx0 = new nx0(new File(file, "cached_content_index.exi"), 1);
        if (m5d == null || z) {
            int i = oaf.a;
            this.e = nx0;
            this.f = m5d;
            return;
        }
        this.e = m5d;
        this.f = nx0;
    }

    public bwf(fl5 fl5, jjf jjf, gpb gpb, gpb gpb2, jl5 jl5) {
        fl5.a();
        goc goc = new goc(fl5.a);
        this.a = fl5;
        this.b = jjf;
        this.c = goc;
        this.d = gpb;
        this.e = gpb2;
        this.f = jl5;
    }
}
