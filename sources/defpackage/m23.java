package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: m23  reason: default package */
public final class m23 {
    public static final m23 b = new m23(0);
    public final /* synthetic */ int a;

    public /* synthetic */ m23(int i) {
        this.a = i;
    }

    public final void a(k36 k36) {
        switch (this.a) {
            case 0:
                k36.m();
                try {
                    k36.U("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - h7g.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    k36.r0();
                    return;
                } finally {
                    k36.S();
                }
            default:
                if (((SQLiteDatabase) k36.b).isWriteAheadLoggingEnabled()) {
                    k36.U("PRAGMA synchronous = NORMAL");
                    return;
                }
                return;
        }
    }
}
