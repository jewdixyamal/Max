package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.logout.a;

/* renamed from: fa9  reason: default package */
public final class fa9 extends da9 {
    public final a c;
    public final jp4 d;

    public fa9(a aVar, jp4 jp4) {
        super(1, 2);
        this.c = aVar;
        this.d = jp4;
    }

    public final void a(k36 k36) {
        hm9.m("Migration_1_2", "start", new Object[0]);
        uz2 uz2 = new uz2(this.d);
        ArrayList arrayList = new ArrayList();
        k36.m();
        try {
            Cursor q0 = k36.q0("SELECT * FROM chats");
            try {
                int columnIndex = q0.getColumnIndex("id");
                int columnIndex2 = q0.getColumnIndex("data");
                while (q0.moveToNext()) {
                    if (!q0.isNull(columnIndex2)) {
                        long j = q0.getLong(columnIndex);
                        try {
                            arrayList.add(new Long[]{Long.valueOf(uz2.a(q0.getBlob(columnIndex2)).l), Long.valueOf(j)});
                        } catch (Throwable unused) {
                            hm9.m0("Migration_1_2", "could not parse blob for chat #" + j, new Object[0]);
                        }
                    }
                }
                v3c.i(q0, (Throwable) null);
                if (arrayList.isEmpty()) {
                    k36.r0();
                    hm9.m("Migration_1_2", "no data, finished!", new Object[0]);
                    k36.S();
                    return;
                }
                k36.U("DROP INDEX IF EXISTS index_chats_server_id");
                k36.U("CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)");
                k36.U("ALTER TABLE chats ADD COLUMN cid INTEGER NOT NULL DEFAULT 0");
                k36.U("CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k36.e0("UPDATE chats SET cid = ? WHERE id = ?", (Long[]) it.next());
                }
                k36.U("CREATE TABLE IF NOT EXISTS `temp_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `constructor_id` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                k36.U("INSERT INTO temp_messages SELECT * FROM messages");
                k36.U("DROP TABLE messages");
                k36.U("ALTER TABLE temp_messages RENAME TO messages");
                k36.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                k36.U("CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
                k36.U("CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
                k36.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
                k36.U("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                k36.U("CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                k36.r0();
                ir6 ir6 = hm9.m;
                if (ir6 != null) {
                    if (ir6.c()) {
                        us7 us7 = us7.X;
                        int size = arrayList.size();
                        ir6.d(us7, "Migration_1_2", "finish! migrate " + size + " chats", (Throwable) null);
                    }
                }
                k36.S();
            } catch (Throwable th) {
                v3c.i(q0, th);
                throw th;
            }
        } catch (Throwable th2) {
            k36.S();
            throw th2;
        }
    }
}
