package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: z95  reason: default package */
public abstract class z95 {
    public static aa5 a(byte[] bArr) {
        try {
            Tasks.ExternalVideoSend externalVideoSend = (Tasks.ExternalVideoSend) qw8.mergeFrom(new Tasks.ExternalVideoSend(), bArr);
            return new aa5(externalVideoSend.requestId, externalVideoSend.messageId, externalVideoSend.externalUrl, externalVideoSend.chatId, externalVideoSend.attachLocalId, externalVideoSend.stickerId);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
