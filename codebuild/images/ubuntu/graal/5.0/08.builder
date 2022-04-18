FROM avalon.ecr.ubuntu/graal/internal-libs:5.0

# Configure SSH
COPY ssh_config /root/.ssh/config
COPY runtimes.yml /codebuild/image/config/runtimes.yml
COPY dockerd-entrypoint.sh /usr/local/bin/
COPY legal/bill_of_material.txt     /usr/share/doc
COPY amazon-ssm-agent.json          /etc/amazon/ssm/

ENTRYPOINT ["/usr/local/bin/rd-entrypoint.sh"]
