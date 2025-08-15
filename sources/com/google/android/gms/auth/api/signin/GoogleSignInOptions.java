package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInOptions extends n3 implements nk, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new vqf(7);
    public static final GoogleSignInOptions v0;
    public static final Scope w0;
    public static final Scope x0;
    public static final Scope y0 = new Scope(1, "https://www.googleapis.com/auth/games");
    public static final ky6 z0 = new ky6(18);
    public final boolean X;
    public final boolean Y;
    public final String Z;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean o;
    public final String s0;
    public final ArrayList t0;
    public final String u0;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        w0 = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        x0 = scope3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(y0)) {
            Scope scope4 = x0;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        v0 = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(y0)) {
            Scope scope5 = x0;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.o = z;
        this.X = z2;
        this.Y = z3;
        this.Z = str;
        this.s0 = str2;
        this.t0 = new ArrayList(map.values());
        this.u0 = str3;
    }

    public static GoogleSignInOptions b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, optString2, str2, new HashMap(), (String) null);
    }

    public static HashMap c(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qe6 qe6 = (qe6) it.next();
                hashMap.put(Integer.valueOf(qe6.b), qe6);
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r1.equals(r5) != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.Z
            java.util.ArrayList r1 = r8.b
            r2 = 0
            if (r9 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r3 = r9.b     // Catch:{ ClassCastException -> 0x007b }
            java.lang.String r4 = r9.Z     // Catch:{ ClassCastException -> 0x007b }
            android.accounts.Account r5 = r9.c     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r6 = r8.t0     // Catch:{ ClassCastException -> 0x007b }
            boolean r6 = r6.isEmpty()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 == 0) goto L_0x007b
            java.util.ArrayList r6 = r9.t0     // Catch:{ ClassCastException -> 0x007b }
            boolean r6 = r6.isEmpty()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 != 0) goto L_0x0021
            goto L_0x007b
        L_0x0021:
            int r6 = r1.size()     // Catch:{ ClassCastException -> 0x007b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }
            r7.<init>(r3)     // Catch:{ ClassCastException -> 0x007b }
            int r7 = r7.size()     // Catch:{ ClassCastException -> 0x007b }
            if (r6 != r7) goto L_0x007b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x007b }
            r6.<init>(r3)     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r1.containsAll(r6)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 != 0) goto L_0x003c
            goto L_0x007b
        L_0x003c:
            android.accounts.Account r1 = r8.c     // Catch:{ ClassCastException -> 0x007b }
            if (r1 != 0) goto L_0x0043
            if (r5 != 0) goto L_0x007b
            goto L_0x0049
        L_0x0043:
            boolean r1 = r1.equals(r5)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 == 0) goto L_0x007b
        L_0x0049:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassCastException -> 0x007b }
            if (r1 == 0) goto L_0x0056
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ ClassCastException -> 0x007b }
            if (r0 == 0) goto L_0x007b
            goto L_0x005d
        L_0x0056:
            boolean r0 = r0.equals(r4)     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != 0) goto L_0x005d
            goto L_0x007b
        L_0x005d:
            boolean r0 = r8.Y     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.Y     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            boolean r0 = r8.o     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.o     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            boolean r0 = r8.X     // Catch:{ ClassCastException -> 0x007b }
            boolean r1 = r9.X     // Catch:{ ClassCastException -> 0x007b }
            if (r0 != r1) goto L_0x007b
            java.lang.String r8 = r8.u0     // Catch:{ ClassCastException -> 0x007b }
            java.lang.String r9 = r9.u0     // Catch:{ ClassCastException -> 0x007b }
            boolean r8 = android.text.TextUtils.equals(r8, r9)     // Catch:{ ClassCastException -> 0x007b }
            if (r8 == 0) goto L_0x007b
            r8 = 1
            return r8
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Scope) arrayList2.get(i2)).b);
        }
        Collections.sort(arrayList);
        Account account = this.c;
        int hashCode = ((arrayList.hashCode() + (1 * 31)) * 31) + (account == null ? 0 : account.hashCode());
        String str = this.Z;
        int hashCode2 = (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.Y ? 1 : 0);
        String str2 = this.u0;
        int i3 = ((((hashCode2 * 31) + (this.o ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.S(parcel, new ArrayList(this.b), 2);
        ay7.P(parcel, 3, this.c, i);
        ay7.X(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ay7.X(parcel, 5, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ay7.X(parcel, 6, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        ay7.Q(parcel, 7, this.Z);
        ay7.Q(parcel, 8, this.s0);
        ay7.S(parcel, this.t0, 9);
        ay7.Q(parcel, 10, this.u0);
        ay7.W(parcel, T);
    }
}
