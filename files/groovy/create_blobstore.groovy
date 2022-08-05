// 创建blob store存储器
import groovy.json.JsonSlurper

parsed_args = new JsonSlurper().parseText(args)

existingBlobStore = blobStore.getBlobStoreManager().get(parsed_args.name)
if (existingBlobStore == null) {
    blobStore.createFileBlobStore(parsed_args.name, parsed_args.path)
}
