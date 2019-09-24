const prime = require('./prime');

console.log("Hello performance friends.");
console.log();

function sanityCheck(n, expected) {
  console.log(`Checking ${n}`);
  if (prime(n) !== expected) {
    console.error(`Looks like your JavaScript is not right: ${prime(n)}`);
  }
}

function run(i) {
  console.log(i);

  console.time('Prime in js');
  prime(i);
  console.timeEnd('Prime in js');
}

// Easy mode warmup
run(100);

// Run a hard prime
run(800000);

run(100);

// Sanity checks.
const checks = [
  [1, 2],
  [7, 17],
  [10000, 104729],
  [100000, 1299709],
];

// Run the checks at the end, otherwise
// they turn on JS optimizations before we start running.
checks.forEach(function (a) {
  sanityCheck(...a);
});

console.log();
console.log('So long and thanks for the fish.');
