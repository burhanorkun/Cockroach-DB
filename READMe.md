
## CockroachDB 
CockroachDB is an open-source SQL database management system designed for distributed, high-scale, and high-resiliency applications. 
Its name represents a tough insect (cockroach) in terms of strength and flexibility. 
CockroachDB was developed with inspiration from technologies such as Google's Bigtable, Google Spanner and PostgreSQL.

Key features of CockroachDB are:

1. <b>Distributed and High-Scale Architecture</b>: CockroachDB distributes data over hundreds or thousands of nodes, providing high-scale and performance database service.
2. <b>High Reliability</b>: High resilience is achieved by backing up, duplicating and distributing data. Data is preserved even if many nodes in the system fail.
3. <b>SQL Compatibility</b>: CockroachDB is a SQL-based database. It is therefore possible to manage and manipulate data using traditional SQL queries.
4. <b>Low Latency</b>: Low latency is achieved thanks to the distributed architecture and data replication. Provides fast access to data.
5. <b>ACID Compliant Transactions</b>: CockroachDB offers operations in accordance with ACID (Atomicity, Consistency, Isolation, Durability) principles, thus ensuring reliable and consistent data transactions.
6. <b>Internal Sharding</b>: Data becomes easier to manage and scale, as data is automatically conditioned and distributed.
7. <b>Local and Global Distribution</b>: Data can be localized or geographically distributed. This provides flexibility for organizations that want to keep data at a regional or global level.
8. <b>Managed Tools</b>: CockroachDB offers easy-to-use tools such as administration panels, monitoring tools, and debugging features.

CockroachDB is often the database of choice for large and complex systems. 
It offers a solution especially suitable for high-scale microservice applications, cloud-based services and business critical applications. 
It's also open-source, making it easy for developers to review, contribute, and customize code to suit their needs.

---

CockroachDB is a database system that supports a subset of the PostgreSQL protocol and is compatible with many of the PostgreSQL drivers available. 
Therefore, the PostgreSQL JDBC driver can be used when connecting to CockroachDB with Java and Maven.

The compatibility of CockroachDB with the PostgreSQL protocol allows existing applications or tools to easily migrate to CockroachDB. 
For example, by using PostgreSQL-specific drivers, tools, or libraries, it becomes possible to run an existing application or software on CockroachDB without much modification.

This facilitates the transition to CockroachDB in the existing ecosystem, while also allowing developers to leverage their previous experience with PostgreSQL. 
Thanks to this approach, it is aimed to spend less effort and time, especially during the transition to CockroachDB.

That is, the main reason for using the PostgreSQL driver when connecting to CockroachDB with Java and Maven is that CockroachDB is compatible with the PostgreSQL protocol and this compatibility is a facilitating factor for the existing ecosystem. 
This results in a lower migration through existing projects and codebases.