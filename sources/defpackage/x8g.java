package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;

/* renamed from: x8g  reason: default package */
public final class x8g extends r25 {
    public final /* synthetic */ WorkersQueueDao_Impl X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8g(WorkersQueueDao_Impl workersQueueDao_Impl, ilc ilc, int i) {
        super(ilc);
        this.o = i;
        this.X = workersQueueDao_Impl;
    }

    public final void A(q36 q36, Object obj) {
        switch (this.o) {
            case 0:
                q8g q8g = (q8g) obj;
                String str = q8g.a;
                if (str == null) {
                    q36.W(1);
                } else {
                    q36.f(1, str);
                }
                String str2 = q8g.b;
                if (str2 == null) {
                    q36.W(2);
                } else {
                    q36.f(2, str2);
                }
                q36.f(3, this.X.__ExistingWorkPolicy_enumToString(q8g.c));
                q36.f(4, x53.n0(q8g.e, ",", (String) null, (String) null, (m56) null, 62));
                q36.j(5, q8g.f);
                q36.j(6, (long) q8g.g);
                h8g h8g = q8g.d;
                String str3 = h8g.a;
                if (str3 == null) {
                    q36.W(7);
                } else {
                    q36.f(7, str3);
                }
                q36.j(8, (long) nu0.O(h8g.b));
                String str4 = h8g.c;
                if (str4 == null) {
                    q36.W(9);
                } else {
                    q36.f(9, str4);
                }
                String str5 = h8g.d;
                if (str5 == null) {
                    q36.W(10);
                } else {
                    q36.f(10, str5);
                }
                byte[] f = d24.f(h8g.e);
                if (f == null) {
                    q36.W(11);
                } else {
                    q36.k(11, f);
                }
                byte[] f2 = d24.f(h8g.f);
                if (f2 == null) {
                    q36.W(12);
                } else {
                    q36.k(12, f2);
                }
                q36.j(13, h8g.g);
                q36.j(14, h8g.h);
                q36.j(15, h8g.i);
                q36.j(16, (long) h8g.k);
                q36.j(17, (long) nu0.b(h8g.l));
                q36.j(18, h8g.m);
                q36.j(19, h8g.n);
                q36.j(20, h8g.o);
                q36.j(21, h8g.p);
                q36.j(22, h8g.q ? 1 : 0);
                q36.j(23, (long) nu0.D(h8g.r));
                q36.j(24, (long) h8g.s);
                q36.j(25, (long) h8g.t);
                kj3 kj3 = h8g.j;
                q36.j(26, (long) nu0.B(kj3.a));
                q36.j(27, kj3.b ? 1 : 0);
                q36.j(28, kj3.c ? 1 : 0);
                q36.j(29, kj3.d ? 1 : 0);
                q36.j(30, kj3.e ? 1 : 0);
                q36.j(31, kj3.f);
                q36.j(32, kj3.g);
                q36.k(33, nu0.M(kj3.h));
                return;
            default:
                q8g q8g2 = (q8g) obj;
                String str6 = q8g2.a;
                if (str6 == null) {
                    q36.W(1);
                } else {
                    q36.f(1, str6);
                }
                String str7 = q8g2.b;
                if (str7 == null) {
                    q36.W(2);
                } else {
                    q36.f(2, str7);
                }
                q36.f(3, this.X.__ExistingWorkPolicy_enumToString(q8g2.c));
                q36.f(4, x53.n0(q8g2.e, ",", (String) null, (String) null, (m56) null, 62));
                q36.j(5, q8g2.f);
                q36.j(6, (long) q8g2.g);
                h8g h8g2 = q8g2.d;
                String str8 = h8g2.a;
                if (str8 == null) {
                    q36.W(7);
                } else {
                    q36.f(7, str8);
                }
                q36.j(8, (long) nu0.O(h8g2.b));
                String str9 = h8g2.c;
                if (str9 == null) {
                    q36.W(9);
                } else {
                    q36.f(9, str9);
                }
                String str10 = h8g2.d;
                if (str10 == null) {
                    q36.W(10);
                } else {
                    q36.f(10, str10);
                }
                byte[] f3 = d24.f(h8g2.e);
                if (f3 == null) {
                    q36.W(11);
                } else {
                    q36.k(11, f3);
                }
                byte[] f4 = d24.f(h8g2.f);
                if (f4 == null) {
                    q36.W(12);
                } else {
                    q36.k(12, f4);
                }
                q36.j(13, h8g2.g);
                q36.j(14, h8g2.h);
                q36.j(15, h8g2.i);
                q36.j(16, (long) h8g2.k);
                q36.j(17, (long) nu0.b(h8g2.l));
                q36.j(18, h8g2.m);
                q36.j(19, h8g2.n);
                q36.j(20, h8g2.o);
                q36.j(21, h8g2.p);
                q36.j(22, h8g2.q ? 1 : 0);
                q36.j(23, (long) nu0.D(h8g2.r));
                q36.j(24, (long) h8g2.s);
                q36.j(25, (long) h8g2.t);
                kj3 kj32 = h8g2.j;
                q36.j(26, (long) nu0.B(kj32.a));
                q36.j(27, kj32.b ? 1 : 0);
                q36.j(28, kj32.c ? 1 : 0);
                q36.j(29, kj32.d ? 1 : 0);
                q36.j(30, kj32.e ? 1 : 0);
                q36.j(31, kj32.f);
                q36.j(32, kj32.g);
                q36.k(33, nu0.M(kj32.h));
                return;
        }
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
