package defpackage;

/* renamed from: x7g  reason: default package */
public final class x7g extends r25 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7g(ilc ilc, int i) {
        super(ilc);
        this.o = i;
    }

    public final void A(q36 q36, Object obj) {
        switch (this.o) {
            case 0:
                w7g w7g = (w7g) obj;
                String str = w7g.a;
                if (str == null) {
                    q36.W(1);
                } else {
                    q36.f(1, str);
                }
                String str2 = w7g.b;
                if (str2 == null) {
                    q36.W(2);
                    return;
                } else {
                    q36.f(2, str2);
                    return;
                }
            case 1:
                z7g z7g = (z7g) obj;
                String str3 = z7g.a;
                if (str3 == null) {
                    q36.W(1);
                } else {
                    q36.f(1, str3);
                }
                byte[] f = d24.f(z7g.b);
                if (f == null) {
                    q36.W(2);
                    return;
                } else {
                    q36.k(2, f);
                    return;
                }
            case 2:
                h8g h8g = (h8g) obj;
                String str4 = h8g.a;
                if (str4 == null) {
                    q36.W(1);
                } else {
                    q36.f(1, str4);
                }
                q36.j(2, (long) nu0.O(h8g.b));
                String str5 = h8g.c;
                if (str5 == null) {
                    q36.W(3);
                } else {
                    q36.f(3, str5);
                }
                String str6 = h8g.d;
                if (str6 == null) {
                    q36.W(4);
                } else {
                    q36.f(4, str6);
                }
                byte[] f2 = d24.f(h8g.e);
                if (f2 == null) {
                    q36.W(5);
                } else {
                    q36.k(5, f2);
                }
                byte[] f3 = d24.f(h8g.f);
                if (f3 == null) {
                    q36.W(6);
                } else {
                    q36.k(6, f3);
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
                    return;
                }
                q36.W(20);
                q36.W(21);
                q36.W(22);
                q36.W(23);
                q36.W(24);
                q36.W(25);
                q36.W(26);
                q36.W(27);
                return;
            default:
                j8g j8g = (j8g) obj;
                String str7 = j8g.a;
                if (str7 == null) {
                    q36.W(1);
                } else {
                    q36.f(1, str7);
                }
                String str8 = j8g.b;
                if (str8 == null) {
                    q36.W(2);
                    return;
                } else {
                    q36.f(2, str8);
                    return;
                }
        }
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
