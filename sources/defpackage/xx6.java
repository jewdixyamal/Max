package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;

/* renamed from: xx6  reason: default package */
public final class xx6 {
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final List p = y53.M(100, Integer.valueOf(HttpStatus.SC_MULTIPLE_CHOICES), 150, 450);
    public final boolean a;
    public final long b;
    public final q33 c;
    public final String d = xx6.class.getName();
    public final je7 e;
    public final je7 f;
    public final SharedPreferences g;
    public final LinkedHashMap h;
    public ux6 i;
    public Integer j;
    public k56 k;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        l = timeUnit.toMillis(3);
        m = timeUnit.toMillis(180);
        n = timeUnit.toMillis(60);
        o = timeUnit.toMillis(60);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: ux6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: ux6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: ux6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ux6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: ux6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xx6(boolean r6, long r7) {
        /*
            r5 = this;
            tx6 r0 = defpackage.tx6.a
            v4 r1 = r0.getAccessor()
            java.lang.Class<q33> r2 = defpackage.q33.class
            java.lang.Object r1 = r1.c(r2)
            q33 r1 = (defpackage.q33) r1
            v4 r2 = r0.getAccessor()
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Object r2 = r2.c(r3)
            android.content.Context r2 = (android.content.Context) r2
            v4 r3 = r0.getAccessor()
            java.lang.Class<ad> r4 = defpackage.ad.class
            khe r3 = r3.d(r4)
            v4 r0 = r0.getAccessor()
            java.lang.Class<an9> r4 = defpackage.an9.class
            khe r0 = r0.d(r4)
            r5.<init>()
            r5.a = r6
            r5.b = r7
            r5.c = r1
            java.lang.Class<xx6> r6 = defpackage.xx6.class
            java.lang.String r6 = r6.getName()
            r5.d = r6
            r5.e = r3
            r5.f = r0
            java.lang.String r6 = "in_app_review_prefs"
            r7 = 0
            android.content.SharedPreferences r6 = r2.getSharedPreferences(r6, r7)
            r5.g = r6
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r5.h = r7
            java.lang.String r7 = "pref_current_condition"
            r8 = 0
            java.lang.String r6 = r6.getString(r7, r8)
            if (r6 == 0) goto L_0x007d
            v25 r7 = defpackage.ux6.v0
            java.util.Iterator r7 = r7.iterator()
        L_0x0062:
            r0 = r7
            u1 r0 = (defpackage.u1) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r0 = r0.next()
            r1 = r0
            ux6 r1 = (defpackage.ux6) r1
            java.lang.String r1 = r1.a
            boolean r1 = defpackage.tpa.f(r1, r6)
            if (r1 == 0) goto L_0x0062
            r8 = r0
        L_0x007b:
            ux6 r8 = (defpackage.ux6) r8
        L_0x007d:
            r5.i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx6.<init>(boolean, long):void");
    }

    public final void a() {
        for (vx6 vx6 : this.h.values()) {
            vx6.getClass();
        }
        this.g.edit().putString("pref_current_condition", (String) null).apply();
        this.i = null;
    }

    public final void b(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.g;
        if (i2 == 4) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", -1).apply();
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_fail_time", currentTimeMillis).apply();
            d((Integer) null);
        } else {
            sharedPreferences.edit().putLong("pref_last_in_app_review_time", currentTimeMillis).apply();
        }
        a();
    }

    public final void c(int i2, Integer num) {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.g;
        if (i2 == 4) {
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_success_time", currentTimeMillis).apply();
            sharedPreferences.edit().putLong("pref_last_fake_in_app_review_fail_time", -1).apply();
            d(num);
        } else {
            sharedPreferences.edit().putLong("pref_last_in_app_review_time", currentTimeMillis).apply();
        }
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [e47, java.lang.Object] */
    public final void d(Integer num) {
        Integer num2;
        ux6 ux6 = this.i;
        if (ux6 != null && (num2 = this.j) != null) {
            ky7 ky7 = new ky7();
            q33 q33 = this.c;
            ky7.put("session_id", Long.valueOf(((t33) q33).F()));
            if (ux6 == ux6.PARTICIPATED_IN_CALL) {
                num2 = ((an9) this.f.getValue()).d();
            }
            ky7.put("screen_from", num2);
            ky7.put("trigger", ux6.a);
            if (num != null) {
                ky7.put("mark", Integer.valueOf(num.intValue()));
            }
            ky7 b2 = ky7.b();
            ? obj = new Object();
            obj.c = "APP_REVIEW";
            obj.o = "app_review";
            obj.b = ((hyc) q33).t();
            obj.a = System.currentTimeMillis();
            obj.b(b2);
            ((ad) this.e.getValue()).j(obj.c());
        }
    }

    public final void e(Integer num) {
        if (this.i != null) {
            if (num == null) {
                num = ((an9) this.f.getValue()).d();
            }
            if (x53.c0(p, num)) {
                this.j = num;
                if (this.a) {
                    dy6.c.P1().b(":inAppReview/fake", (Bundle) null);
                    return;
                }
                k56 k56 = this.k;
                if (k56 != null) {
                    k56.invoke();
                }
            }
        }
    }

    public final void f(Set set, wuc wuc) {
        ux6 ux6 = this.i;
        String str = this.d;
        if (ux6 != null) {
            hm9.m(str, "InAppReviewConditionManager triggerCondition() currentCondition != null (" + ux6 + ")", new Object[0]);
            return;
        }
        t33 t33 = (t33) this.c;
        boolean z = t33.g.getBoolean("app.disable_in_app_review_time_condition", false);
        SharedPreferences sharedPreferences = this.g;
        if (z) {
            hm9.m(str, "InAppReviewConditionManager isTimeAllowsStartInAppReview() clientPrefs.isDisableInAppReviewTimeCondition:" + t33.g.getBoolean("app.disable_in_app_review_time_condition", false), new Object[0]);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - l < this.b) {
                hm9.m(str, "InAppReviewConditionManager isTimeAllowsStartInAppReview() hadCrashInPrevious3Days", new Object[0]);
                return;
            }
            long j2 = sharedPreferences.getLong("pref_last_fake_in_app_review_success_time", -1);
            long j3 = sharedPreferences.getLong("pref_last_fake_in_app_review_fail_time", -1);
            long j4 = sharedPreferences.getLong("pref_last_in_app_review_time", -1);
            int i2 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
            if (!(i2 == 0 && j3 == -1 && j4 == -1) && ((i2 == 0 || currentTimeMillis - j2 < m) && ((j3 == -1 || currentTimeMillis - j3 < n) && (j4 == -1 || currentTimeMillis - j4 < o)))) {
                StringBuilder k2 = au1.k(currentTimeMillis, "InAppReviewConditionManager isTimeAllowsStartInAppReview() currentTime:", ", lastSuccessfulFakeReviewTime:");
                k2.append(j2);
                au1.q(j3, ", lastFailedFakeReviewTime:", ", lastReviewTime:", k2);
                k2.append(j4);
                hm9.m(str, k2.toString(), new Object[0]);
                return;
            }
        }
        Iterator it = set.iterator();
        String str2 = null;
        ux6 ux62 = null;
        while (it.hasNext()) {
            wx6 wx6 = (wx6) it.next();
            int ordinal = wx6.a.ordinal();
            int i3 = wx6.b;
            if (ordinal == 0) {
                int i4 = sharedPreferences.getInt("pref_sent_messages_count", 0) + i3;
                if (i4 >= 5) {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_sent_messages_count", i4).apply();
                    hm9.m(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6 + ", sentMessagesCount:" + i4, new Object[0]);
                }
            } else if (ordinal == 3) {
                int i5 = sharedPreferences.getInt("pref_reactions_count", 0) + i3;
                if (i5 >= 2) {
                    sharedPreferences.edit().putInt("pref_reactions_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_reactions_count", i5).apply();
                    hm9.m(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6 + ", addedReactionsCount:" + i5, new Object[0]);
                }
            } else if (ordinal == 4) {
                int i6 = sharedPreferences.getInt("pref_sent_stickers_count", 0) + i3;
                if (i6 >= 3) {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_sent_stickers_count", i6).apply();
                    hm9.m(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6 + ", sentStickersCount:" + i6, new Object[0]);
                }
            } else if (ordinal == 5) {
                int i7 = sharedPreferences.getInt("pref_created_group_chats_count", 0) + i3;
                if (i7 >= 2) {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_created_group_chats_count", i7).apply();
                    hm9.m(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6 + ", createdGroupChatsCount:" + i7, new Object[0]);
                }
            } else if (ordinal == 6) {
                int i8 = sharedPreferences.getInt("pref_made_pin_count", 0) + i3;
                if (i8 >= 2) {
                    sharedPreferences.edit().putInt("pref_made_pin_count", 0).apply();
                } else {
                    sharedPreferences.edit().putInt("pref_made_pin_count", i8).apply();
                    hm9.m(str, "InAppReviewConditionManager isConditionAllowsStartInAppReview() triggeredCondition:" + wx6 + ", madePinCount:" + i8, new Object[0]);
                }
            }
            ux62 = wx6.a;
        }
        if (ux62 != null && ((vx6) this.h.get(ux62)) != null) {
            this.i = ux62;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            ux6 ux63 = this.i;
            if (ux63 != null) {
                str2 = ux63.a;
            }
            edit.putString("pref_current_condition", str2).apply();
            e(Integer.valueOf(wuc.a));
        }
    }
}
