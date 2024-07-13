const args = process.argv.slice(2);

function findLCS(strings) {
    if (strings.length === 0) return '';

    let reference = strings[0];
    let maxLen = 0;
    let endIndex = 0;

    let dp = Array(reference.length + 1).fill(null).map(() => Array(reference.length + 1).fill(0));

    for (let i = 0; i < reference.length; i++) {
        for (let j = i + 1; j <= reference.length; j++) {
            let substring = reference.slice(i, j);
            let isCommon = strings.every((str) => str.includes(substring));

            if (isCommon && substring.length > maxLen) {
                maxLen = substring.length;
                endIndex = j;
            }
        }
    }

    return reference.slice(endIndex - maxLen, endIndex);
}

const lcs = findLCS(args);
console.log(lcs);