package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: p9d  reason: default package */
public abstract class p9d {
    public static q9d a(byte[] bArr) {
        try {
            Tasks.SyncChatHistory syncChatHistory = (Tasks.SyncChatHistory) qw8.mergeFrom(new Tasks.SyncChatHistory(), bArr);
            q9d q9d = new q9d(syncChatHistory.taskId, syncChatHistory.chatId, syncChatHistory.count, xxc.l(mg4.o, Integer.valueOf(syncChatHistory.itemTypeId)));
            hm9.m(q9d.Y, "parseFrom", new Object[0]);
            return q9d;
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
