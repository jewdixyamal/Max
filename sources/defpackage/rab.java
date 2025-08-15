package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: rab  reason: default package */
public abstract class rab {
    public static sab a(byte[] bArr) {
        try {
            Tasks.Profile profile = (Tasks.Profile) qw8.mergeFrom(new Tasks.Profile(), bArr);
            Tasks.Rect rect = profile.crop;
            return new sab(profile.requestId, profile.firstName, profile.lastName, profile.photoToken, profile.photoId, rect != null ? new a20(rect.left, rect.top, rect.right, rect.bottom, 2) : null, profile.description, profile.link, profile.avatarType.equals("PRESET_AVATAR") ? 1 : 2);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
