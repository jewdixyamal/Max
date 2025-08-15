package ru.ok.android.externcalls.sdk.record;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fJA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager;", "", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "params", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lzad;", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "StartParams", "StartRecordInfo", "StopParams", "StopRecordInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface RecordManager {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001,B\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b'\u0010\u001eR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b+\u0010*¨\u0006-"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "", "", "isStream", "", "movieId", "", "albumId", "Lzad;", "sessionRoomId", "", "name", "description", "groupId", "privacy", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "Le5f;", "onSuccess", "", "onError", "<init>", "(ZLjava/lang/Long;Ljava/lang/String;Lzad;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Long;Ljava/lang/String;Lm56;Lm56;)V", "Z", "()Z", "Ljava/lang/Long;", "getMovieId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getAlbumId", "()Ljava/lang/String;", "Lzad;", "getSessionRoomId", "()Lzad;", "Ljava/lang/CharSequence;", "getName", "()Ljava/lang/CharSequence;", "getDescription", "getGroupId", "getPrivacy", "Lm56;", "getOnSuccess", "()Lm56;", "getOnError", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class StartParams {
        private final String albumId;
        private final CharSequence description;
        private final Long groupId;
        private final boolean isStream;
        private final Long movieId;
        private final CharSequence name;
        private final m56 onError;
        private final m56 onSuccess;
        private final String privacy;
        private final zad sessionRoomId;

        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b%\u0010\"J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R$\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010.R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010.R\u001c\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0018\u0010-\u0012\u0004\b/\u0010\u0003¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "<init>", "()V", "", "movieId", "withMovieId", "(Ljava/lang/Long;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "isStream", "(Z)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "Lzad;", "sessionRoomId", "withSessionRoomId", "(Lzad;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "name", "withName", "(Ljava/lang/CharSequence;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "description", "withDescription", "groupId", "withGroupId", "", "privacy", "withPrivacy", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "albumId", "withAlbumId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "Le5f;", "onSuccess", "withCallOnSuccess", "(Lm56;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "onError", "withCallOnError", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "build", "()Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Z", "Ljava/lang/Long;", "Lzad;", "Ljava/lang/CharSequence;", "Ljava/lang/String;", "Lm56;", "getPrivacy$annotations", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
        public static final class Builder {
            private String albumId;
            private CharSequence description = "";
            private Long groupId;
            private boolean isStream;
            private Long movieId;
            private CharSequence name;
            private m56 onError;
            private m56 onSuccess;
            private String privacy = "PUBLIC";
            private zad sessionRoomId;

            private static /* synthetic */ void getPrivacy$annotations() {
            }

            public final StartParams build() {
                boolean z = this.isStream;
                Long l = this.movieId;
                zad zad = this.sessionRoomId;
                CharSequence charSequence = this.name;
                CharSequence charSequence2 = this.description;
                String str = this.privacy;
                return new StartParams(z, l, this.albumId, zad, charSequence, charSequence2, this.groupId, str, this.onSuccess, this.onError, (z84) null);
            }

            public final Builder isStream(boolean z) {
                this.isStream = z;
                return this;
            }

            public final Builder withAlbumId(String str) {
                this.albumId = str;
                return this;
            }

            public final Builder withCallOnError(m56 m56) {
                this.onError = m56;
                return this;
            }

            public final Builder withCallOnSuccess(m56 m56) {
                this.onSuccess = m56;
                return this;
            }

            public final Builder withDescription(CharSequence charSequence) {
                this.description = charSequence;
                return this;
            }

            public final Builder withGroupId(Long l) {
                this.groupId = l;
                return this;
            }

            public final Builder withMovieId(Long l) {
                this.movieId = l;
                return this;
            }

            public final Builder withName(CharSequence charSequence) {
                this.name = charSequence;
                return this;
            }

            public final Builder withPrivacy(String str) {
                this.privacy = str;
                return this;
            }

            public final Builder withSessionRoomId(zad zad) {
                this.sessionRoomId = zad;
                return this;
            }
        }

        public /* synthetic */ StartParams(boolean z, Long l, String str, zad zad, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, m56 m56, m56 m562, z84 z84) {
            this(z, l, str, zad, charSequence, charSequence2, l2, str2, m56, m562);
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final CharSequence getDescription() {
            return this.description;
        }

        public final Long getGroupId() {
            return this.groupId;
        }

        public final Long getMovieId() {
            return this.movieId;
        }

        public final CharSequence getName() {
            return this.name;
        }

        public final m56 getOnError() {
            return this.onError;
        }

        public final m56 getOnSuccess() {
            return this.onSuccess;
        }

        public final String getPrivacy() {
            return this.privacy;
        }

        public final zad getSessionRoomId() {
            return this.sessionRoomId;
        }

        public final boolean isStream() {
            return this.isStream;
        }

        private StartParams(boolean z, Long l, String str, zad zad, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, m56 m56, m56 m562) {
            this.isStream = z;
            this.movieId = l;
            this.albumId = str;
            this.sessionRoomId = zad;
            this.name = charSequence;
            this.description = charSequence2;
            this.groupId = l2;
            this.privacy = str2;
            this.onSuccess = m56;
            this.onError = m562;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartRecordInfo;", "", "()V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartRecordInfo {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "", "Lzad;", "sessionRoomId", "", "removeRecord", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo;", "Le5f;", "onSuccess", "", "onError", "<init>", "(Lzad;ZLm56;Lm56;)V", "Lzad;", "getSessionRoomId", "()Lzad;", "Z", "getRemoveRecord", "()Z", "Lm56;", "getOnSuccess", "()Lm56;", "getOnError", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class StopParams {
        private final m56 onError;
        private final m56 onSuccess;
        private final boolean removeRecord;
        private final zad sessionRoomId;

        public StopParams() {
            this((zad) null, false, (m56) null, (m56) null, 15, (z84) null);
        }

        public final m56 getOnError() {
            return this.onError;
        }

        public final m56 getOnSuccess() {
            return this.onSuccess;
        }

        public final boolean getRemoveRecord() {
            return this.removeRecord;
        }

        public final zad getSessionRoomId() {
            return this.sessionRoomId;
        }

        public StopParams(zad zad, boolean z, m56 m56, m56 m562) {
            this.sessionRoomId = zad;
            this.removeRecord = z;
            this.onSuccess = m56;
            this.onError = m562;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StopParams(zad zad, boolean z, m56 m56, m56 m562, int i, z84 z84) {
            this((i & 1) != 0 ? null : zad, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : m56, (i & 8) != 0 ? null : m562);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo;", "", "removeResult", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;)V", "getRemoveResult", "()Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RemoveResult", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StopRecordInfo {
        private final RemoveResult removeResult;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopRecordInfo$RemoveResult;", "", "(Ljava/lang/String;I)V", "NOT_REQUESTED", "REMOVED", "NOT_SUPPORTED", "NOT_REMOVED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum RemoveResult {
            NOT_REQUESTED,
            REMOVED,
            NOT_SUPPORTED,
            NOT_REMOVED;

            static {
                RemoveResult[] $values;
                $ENTRIES = new v25($values);
            }

            public static u25 getEntries() {
                return $ENTRIES;
            }
        }

        public StopRecordInfo(RemoveResult removeResult2) {
            this.removeResult = removeResult2;
        }

        public static /* synthetic */ StopRecordInfo copy$default(StopRecordInfo stopRecordInfo, RemoveResult removeResult2, int i, Object obj) {
            if ((i & 1) != 0) {
                removeResult2 = stopRecordInfo.removeResult;
            }
            return stopRecordInfo.copy(removeResult2);
        }

        public final RemoveResult component1() {
            return this.removeResult;
        }

        public final StopRecordInfo copy(RemoveResult removeResult2) {
            return new StopRecordInfo(removeResult2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopRecordInfo) && this.removeResult == ((StopRecordInfo) obj).removeResult;
        }

        public final RemoveResult getRemoveResult() {
            return this.removeResult;
        }

        public int hashCode() {
            return this.removeResult.hashCode();
        }

        public String toString() {
            RemoveResult removeResult2 = this.removeResult;
            return "StopRecordInfo(removeResult=" + removeResult2 + ")";
        }
    }

    static /* synthetic */ void startRecord$default(RecordManager recordManager, StartParams startParams, k56 k56, m56 m56, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                k56 = null;
            }
            if ((i & 4) != 0) {
                m56 = null;
            }
            recordManager.startRecord(startParams, k56, m56);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRecord");
    }

    static /* synthetic */ void stopRecord$default(RecordManager recordManager, StopParams stopParams, k56 k56, m56 m56, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                k56 = null;
            }
            if ((i & 4) != 0) {
                m56 = null;
            }
            recordManager.stopRecord(stopParams, k56, m56);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecord");
    }

    void addRecordListener(RecordEventListener recordEventListener);

    RecordDescription getRecordDescription();

    Map<zad, RecordDescriptionHistory> getRecordDescriptionHistory();

    void removeRecordListener(RecordEventListener recordEventListener);

    void startRecord(StartParams startParams, k56 k56, m56 m56);

    void stopRecord(StopParams stopParams, k56 k56, m56 m56);
}
