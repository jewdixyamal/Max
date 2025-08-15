package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ha4  reason: default package */
public final class ha4 extends q25 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha4(ilc ilc, int i) {
        super(ilc);
        this.o = i;
    }

    public final void A(q36 q36, Object obj) {
        switch (this.o) {
            case 0:
                au1.r(obj);
                throw null;
            case 1:
                au1.r(obj);
                throw null;
            case 2:
                au1.r(obj);
                throw null;
            case 3:
                xua xua = (xua) obj;
                q36.j(1, xua.a);
                q36.j(2, xua.b);
                q36.j(3, (long) xua.c);
                String str = xua.d;
                if (str == null) {
                    q36.W(4);
                } else {
                    q36.f(4, str);
                }
                q36.j(5, xua.e);
                String str2 = xua.f;
                if (str2 == null) {
                    q36.W(6);
                } else {
                    q36.f(6, str2);
                }
                String str3 = xua.g;
                if (str3 == null) {
                    q36.W(7);
                } else {
                    q36.f(7, str3);
                }
                String str4 = xua.h;
                if (str4 == null) {
                    q36.W(8);
                } else {
                    q36.f(8, str4);
                }
                String str5 = xua.i;
                if (str5 == null) {
                    q36.W(9);
                } else {
                    q36.f(9, str5);
                }
                q36.j(10, (long) au1.s(xua.j));
                q36.j(11, xua.a);
                return;
            case 4:
                q36.j(1, ((e9c) obj).a);
                return;
            case 5:
                nkc nkc = (nkc) obj;
                String str6 = nkc.a;
                if (str6 == null) {
                    q36.W(1);
                } else {
                    q36.f(1, str6);
                }
                String str7 = nkc.b;
                if (str7 == null) {
                    q36.W(2);
                } else {
                    q36.f(2, str7);
                }
                String str8 = nkc.c;
                if (str8 == null) {
                    q36.W(3);
                } else {
                    q36.f(3, str8);
                }
                q36.j(4, (long) nkc.d);
                q36.f(5, dy7.p(nkc.e));
                q36.j(6, nkc.f ? 1 : 0);
                q36.j(7, nkc.g ? 1 : 0);
                byte[] bArr = null;
                List list = nkc.h;
                byte[] b = list != null ? ou8.b(list) : null;
                if (b == null) {
                    q36.W(8);
                } else {
                    q36.k(8, b);
                }
                Long l = nkc.i;
                if (l == null) {
                    q36.W(9);
                } else {
                    q36.j(9, l.longValue());
                }
                Map map = nkc.j;
                byte[] byteArray = map != null ? qw8.toByteArray(xfg.i(map)) : null;
                if (byteArray == null) {
                    q36.W(10);
                } else {
                    q36.k(10, byteArray);
                }
                List list2 = nkc.k;
                byte[] byteArray2 = list2 != null ? qw8.toByteArray(xfg.k(list2)) : null;
                if (byteArray2 == null) {
                    q36.W(11);
                } else {
                    q36.k(11, byteArray2);
                }
                Set set = nkc.l;
                if (set != null) {
                    bArr = qw8.toByteArray(xfg.j(set));
                }
                if (bArr == null) {
                    q36.W(12);
                } else {
                    q36.k(12, bArr);
                }
                q36.j(13, nkc.m ? 1 : 0);
                String str9 = nkc.a;
                if (str9 == null) {
                    q36.W(14);
                    return;
                } else {
                    q36.f(14, str9);
                    return;
                }
            case 6:
                puf puf = (puf) obj;
                q36.j(1, puf.a);
                q36.j(2, puf.b);
                q36.j(3, puf.c);
                String str10 = puf.d;
                if (str10 == null) {
                    q36.W(4);
                } else {
                    q36.f(4, str10);
                }
                q36.j(5, puf.e ? 1 : 0);
                q36.j(6, puf.f ? 1 : 0);
                q36.j(7, puf.a);
                return;
            default:
                h8g h8g = (h8g) obj;
                String str11 = h8g.a;
                if (str11 == null) {
                    q36.W(1);
                } else {
                    q36.f(1, str11);
                }
                q36.j(2, (long) nu0.O(h8g.b));
                String str12 = h8g.c;
                if (str12 == null) {
                    q36.W(3);
                } else {
                    q36.f(3, str12);
                }
                String str13 = h8g.d;
                if (str13 == null) {
                    q36.W(4);
                } else {
                    q36.f(4, str13);
                }
                byte[] f = d24.f(h8g.e);
                if (f == null) {
                    q36.W(5);
                } else {
                    q36.k(5, f);
                }
                byte[] f2 = d24.f(h8g.f);
                if (f2 == null) {
                    q36.W(6);
                } else {
                    q36.k(6, f2);
                }
                q36.j(7, h8g.g);
                q36.j(8, h8g.h);
                q36.j(9, h8g.i);
                q36.j(10, (long) h8g.k);
                q36.j(11, (long) nu0.b(h8g.l));
                q36.j(12, h8g.m);
                q36.j(13, h8g.n);
                q36.j(14, h8g.o);
                q36.j(15, h8g.p);
                q36.j(16, h8g.q ? 1 : 0);
                q36.j(17, (long) nu0.D(h8g.r));
                q36.j(18, (long) h8g.s);
                q36.j(19, (long) h8g.t);
                kj3 kj3 = h8g.j;
                if (kj3 != null) {
                    q36.j(20, (long) nu0.B(kj3.a));
                    q36.j(21, kj3.b ? 1 : 0);
                    q36.j(22, kj3.c ? 1 : 0);
                    q36.j(23, kj3.d ? 1 : 0);
                    q36.j(24, kj3.e ? 1 : 0);
                    q36.j(25, kj3.f);
                    q36.j(26, kj3.g);
                    q36.k(27, nu0.M(kj3.h));
                } else {
                    q36.W(20);
                    q36.W(21);
                    q36.W(22);
                    q36.W(23);
                    q36.W(24);
                    q36.W(25);
                    q36.W(26);
                    q36.W(27);
                }
                String str14 = h8g.a;
                if (str14 == null) {
                    q36.W(28);
                    return;
                } else {
                    q36.f(28, str14);
                    return;
                }
        }
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "DELETE FROM `default_emoji` WHERE `emoji` = ?";
            case 1:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`cid` = ?,`time` = ?,`time_local` = ?,`ttl` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`delivery_status` = ?,`status` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`view_time` = ? WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `phones` SET `id` = ?,`phonebook_id` = ?,`contact_id` = ?,`phone` = ?,`server_phone` = ?,`email` = ?,`first_name` = ?,`last_name` = ?,`avatar_path` = ?,`type` = ? WHERE `id` = ?";
            case 4:
                return "DELETE FROM `recent` WHERE `id` = ?";
            case 5:
                return "UPDATE OR REPLACE `chat_folder` SET `id` = ?,`title` = ?,`emoji` = ?,`order` = ?,`filters` = ?,`isHiddenForAllFolder` = ?,`hideIfEmpty` = ?,`elements` = ?,`creatorId` = ?,`filterSubjects` = ?,`widgets` = ?,`options` = ?,`isRemoved` = ? WHERE `id` = ?";
            case 6:
                return "UPDATE OR REPLACE `webapp_biometry` SET `id` = ?,`user_id` = ?,`bot_id` = ?,`token` = ?,`access_requested` = ?,`access_granted` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }
}
